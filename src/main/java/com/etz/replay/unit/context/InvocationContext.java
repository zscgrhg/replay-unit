package com.etz.replay.unit.context;

import com.etz.replay.unit.classmap.SubjectContext;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Data
public class InvocationContext {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(InvocationContext.class);

    public final static ThreadLocal<InvocationContext> CONTEXT = new ThreadLocal<>();

    public static final AtomicLong CXT_INCR = new AtomicLong(1);
    public final AtomicInteger ENTRY_COUNTER = new AtomicInteger(Integer.MIN_VALUE);
    public final AtomicInteger EXIT_COUNTER = new AtomicInteger(Integer.MAX_VALUE);

    public final Long id = CXT_INCR.getAndIncrement();
    public Invocation origin;
    final ParamWriter paramWriter = new ParamWriterImpl();
    @JsonIgnore
    final Stack<Invocation> stack = new Stack<>();
    @JsonIgnore
    public final Map<Long, Invocation> map = new HashMap<>();

    public static InvocationContext getCurrent(boolean create) {
        InvocationContext current = CONTEXT.get();
        if (create && current == null) {
            CONTEXT.set(new InvocationContext());
        }
        return CONTEXT.get();
    }

    public boolean entryIncr(String rule) {

        long prev = ENTRY_COUNTER.get();
        int length = Thread.currentThread().getStackTrace().length;
        if (length > prev) {
            ENTRY_COUNTER.set(length);
            EXIT_COUNTER.set(Integer.MAX_VALUE);
            return true;
        }
        return false;
    }

    public boolean entryMinus(String rule) {

        long prev = EXIT_COUNTER.get();
        int length = Thread.currentThread().getStackTrace().length;
        if (length < prev) {
            EXIT_COUNTER.set(length);
            ENTRY_COUNTER.set(Integer.MIN_VALUE);
            return true;
        }
        return false;
    }

    public void push(Invocation invocation, Object[] args) {
        boolean subject = SubjectContext.isSubject(invocation.getClazz());
        if (!stack.isEmpty()) {
            Invocation parent = stack.lastElement();
            invocation.parentId = parent.id;
            parent.getChildren().add(invocation);
            boolean notSubject = stack.stream().anyMatch(inv -> inv.identity(invocation));
            invocation.setSubject(!notSubject && subject);
        } else {
            invocation.setSubject(subject);
        }

        stack.push(invocation);
        map.put(invocation.id, invocation);
        ParamInfo p = new ParamInfo();
        p.args = args;
        p.invocationId = invocation.id;
        p.name = "in";
        paramWriter.write(p);
    }

    public void pop(String rule, Object[] args, Object returnValue, Throwable exception) {


        if (exception != null) {
            exception.printStackTrace();
            System.exit(1);
        }
        Invocation pop = stack.pop();
        ParamInfo atExit = new ParamInfo();
        atExit.invocationId = pop.id;
        atExit.args = args;
        atExit.returned = returnValue;
        atExit.thrown = exception;
        if (exception != null) {
            atExit.exception = exception.getClass().getName();
        }
        atExit.name = "out";
        paramWriter.write(atExit);
        if (stack.isEmpty()) {
            paramWriter.write(this);
            CONTEXT.remove();
        }
    }


    public List<Invocation> getNodes() {
        List<Invocation> root = map.values().stream().filter(Invocation::isSubject).collect(Collectors.toList());
        return root;
    }

}
