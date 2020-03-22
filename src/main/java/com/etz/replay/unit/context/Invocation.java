package com.etz.replay.unit.context;

import com.etz.replay.unit.classmap.SubjectContext;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Invocation {
    public static final AtomicLong INVOCATION_INCR = new AtomicLong(1);
    public final long threadId;
    public final Long id = INVOCATION_INCR.getAndIncrement();
    public Long parentId;
    public Map<Object, String> refMap;
    public String method;
    public String methodSignure;
    public final List<Invocation> children = new CopyOnWriteArrayList<>();
    @JsonIgnore
    public Object thisRef;
    public String refPath;
    public Class clazz;
    public boolean staticInvoke = false;
    public boolean subject = false;

    public volatile boolean finished = false;

    public Invocation() {
        this.threadId = Thread.currentThread().getId();
    }

    public boolean identity(Invocation other) {
        if (other.thisRef == null || thisRef == null) {
            return false;
        }
        return thisRef == other.thisRef;
    }

    public void setThisRef(Object thisRef) {
        try {
            this.thisRef = thisRef;
            this.refPath = SubjectContext.refPathOf(thisRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRefPath(String refPath) {

    }
}
