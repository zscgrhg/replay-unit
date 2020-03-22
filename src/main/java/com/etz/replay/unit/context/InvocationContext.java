package com.etz.replay.unit.context;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.etz.replay.unit.classmap.SubjectContext;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Data
public class InvocationContext {

    public final static TransmittableThreadLocal<Invocation> PREVIOUS = new TransmittableThreadLocal<>();
    public static final AtomicLong CXT_INCR = new AtomicLong(1);
    public final static ThreadLocal<InvocationContext> CONTEXT = new ThreadLocal<>();
    public final static ThreadLocal<Stack<Invocation>> STACK_THREAD_LOCAL = new ThreadLocal<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(InvocationContext.class);


    public final AtomicInteger ENTRY_COUNTER = new AtomicInteger(Integer.MIN_VALUE);
    public final AtomicInteger EXIT_COUNTER = new AtomicInteger(Integer.MAX_VALUE);

    public final Long id = CXT_INCR.getAndIncrement();
    final ParamWriter paramWriter = new ParamWriterImpl();
    @JsonIgnore
    public final Map<Long, Invocation> map = new ConcurrentHashMap<>();

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
        LOGGER.error(rule + ">>>" + prev + "/" + length + "@" + id);
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
        LOGGER.error(rule + ">>>" + prev + "/" + length + "@" + id);
        if (length < prev) {
            EXIT_COUNTER.set(length);
            ENTRY_COUNTER.set(Integer.MIN_VALUE);
            return true;
        }
        return false;
    }

    public void push(String rule, Invocation invocation, Class<?>[] parameterTypes, Object[] args) {
        Stack<Invocation> stack = STACK_THREAD_LOCAL.get();

        if (stack == null) {
            stack = new Stack<>();
            STACK_THREAD_LOCAL.set(stack);
        }
        LOGGER.error("push@@@" + Thread.currentThread().getName() + ",stack=" + stack + ",rule=" + rule);
        boolean subject = SubjectContext.isSubject(invocation.getClazz());
        Invocation prev = PREVIOUS.get();
        if (prev != null) {
            invocation.parentId = prev.id;
            if (!prev.finished) {
                prev.getChildren().add(invocation);
            }
            boolean notSubject = stack.stream().anyMatch(inv -> inv.identity(invocation));
            invocation.setSubject(!notSubject && subject);
        } else {
            invocation.setSubject(subject);
        }
        stack.push(invocation);
        PREVIOUS.set(invocation);
        map.put(invocation.id, invocation);
        ParamInfo p = new ParamInfo();
        p.args = args;
        p.argsType = parameterTypes;
        p.valuesType = ParamInfo.valuesTypeOf(parameterTypes, args);
        p.invocationId = invocation.id;
        p.name = "in";
        paramWriter.write(p);
    }

    public void pop(String rule, Class<?>[] parameterTypes, Object[] args, Class reType, Object returnValue, Throwable exception) {
        Stack<Invocation> stack = STACK_THREAD_LOCAL.get();
        if (stack == null) {
            //impossible
            stack = new Stack<>();
            STACK_THREAD_LOCAL.set(stack);
        }
        LOGGER.error("pop@@@" + Thread.currentThread().getName() + ",stack=" + stack + ",rule=" + rule);
        if (exception != null) {
            exception.printStackTrace();
            System.exit(1);
        }
        Invocation pop = stack.pop();
        pop.finished = true;
        ParamInfo p = new ParamInfo();
        p.invocationId = pop.id;
        p.args = args;
        p.argsType = parameterTypes;
        p.valuesType = ParamInfo.valuesTypeOf(parameterTypes, args);
        p.returned = returnValue;
        p.returnedValueType = ParamInfo.typeOf(reType, returnValue);
        p.thrown = exception;
        if (exception != null) {
            p.exception = exception.getClass().getName();
        }
        p.name = "out";
        paramWriter.write(p);
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
