package com.etz.replay.unit.context;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Invocation {
    public static final AtomicLong INVOCATION_INCR = new AtomicLong(1);
    public final Long id = INVOCATION_INCR.getAndIncrement();
    public Long parentId;
    public Map<Object, String> refMap;
    public String method;
    public List<Invocation> children = new ArrayList<>();
    @JsonIgnore
    public Object thisRef;
    public String refPath;
    public Class clazz;
    public boolean staticInvoke = false;
    public boolean subject = false;
    List<InvocationContext> spawnContext = new ArrayList<>();

    public boolean identity(Invocation other) {
        if (other.thisRef == null || thisRef == null) {
            return false;
        }
        return thisRef == other.thisRef;
    }
}
