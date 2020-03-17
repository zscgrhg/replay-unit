package com.etz.replay.unit.context;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Data
public class InvocationContext {
    public final static ThreadLocal<InvocationContext> CONTEXT = new ThreadLocal<>();

    public static final AtomicLong CXT_INCR = new AtomicLong(1);
    public final Long id = CXT_INCR.getAndIncrement();
    public Invocation origin;
    final ParamWriter paramWriter = new ParamWriterImpl();
    @JsonIgnore
    final Stack<Invocation> stack = new Stack<>();
    @JsonIgnore
    public final Map<Long, Invocation> map = new HashMap<>();


    public static InvocationContext getCurrent() {
        InvocationContext current = CONTEXT.get();
        if (current == null) {
            CONTEXT.set(new InvocationContext());
        }
        return CONTEXT.get();
    }


    public void push(Invocation invocation) {
        if (!stack.isEmpty()) {
            Invocation parent = stack.lastElement();
            invocation.parentId = parent.id;
            parent.getChildren().add(invocation);
        }
        stack.push(invocation);
        map.put(invocation.id, invocation);
        ParamInfo p = new ParamInfo();
        p.args = invocation.args;
        p.invocationId = invocation.id;
        p.name = "in";
        paramWriter.write(p);
    }

    public void pop(Object[] args, Object returnValue, Throwable exception) {
        Invocation pop = stack.pop();
        pop.setReturnValue(returnValue);
        pop.setThrown(exception);
        pop.setArgs(args);
        ParamInfo atExit = new ParamInfo();
        atExit.invocationId = pop.id;
        atExit.args = args;
        atExit.name = "out";
        paramWriter.write(atExit);
        if (stack.isEmpty()) {
            paramWriter.write(this);
            CONTEXT.remove();
        }
    }


    public List<Invocation> getNodes() {
        List<Invocation> root = map.values().stream().filter(p -> p.getParentId() == null).collect(Collectors.toList());
        return root;
    }

}
