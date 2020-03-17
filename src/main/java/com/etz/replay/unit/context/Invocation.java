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
    public Class declaredType;
    public boolean isStatic = false;
    List<InvocationContext> spawnContext = new ArrayList<>();
}
