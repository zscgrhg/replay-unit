package com.etz.replay.unit.context;

import com.etz.replay.unit.classmap.RefsInfo;
import com.etz.replay.unit.classmap.SubjectContext;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.ToString;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import static com.etz.replay.unit.classmap.SubjectContext.SUBJECT_CLASS_CONTEXT;
import static com.etz.replay.unit.classmap.SubjectContext.keyOfArgs;

@Data
@ToString(exclude = {
        "parent",
        "refMap",
        "methodSignure",
        "children"
})
public class Invocation {
    public static final AtomicLong INVOCATION_INCR = new AtomicLong(1);
    public final long threadId;
    public final Long id = INVOCATION_INCR.getAndIncrement();
    @JsonIgnore
    public final Map<Object, RefsInfo> refs = new HashMap<>();
    public Long parentId;
    @JsonIgnore
    public Object thisObject;
    public String method;
    public String methodSignure;
    public final List<Invocation> children = new CopyOnWriteArrayList<>();
    @JsonIgnore
    Invocation parent;
    public String refPath;
    public Class clazz;
    public boolean staticInvoke = false;
    public boolean subject = false;

    public volatile boolean finished = false;

    public Invocation() {
        this.threadId = Thread.currentThread().getId();
    }

    public boolean identity(Invocation other) {
        if (other.thisObject == null || thisObject == null) {
            return false;
        }
        return thisObject == other.thisObject;
    }

    @SneakyThrows
    public void saveObjectsRef(String methodSignure, Object[] args) {

        try {
            boolean isSubject = SubjectContext.isSubject(clazz);
            if (isSubject) {
                Map<String, RefsInfo> refMap = SUBJECT_CLASS_CONTEXT.get(clazz);
                Map<String, Object> argMap = new HashMap<>();
                if (args != null && args.length > 0) {
                    for (int i = 0; i < args.length; i++) {
                        argMap.put(keyOfArgs(methodSignure, i), args[i]);
                    }
                }
                RefsInfo refThis = new RefsInfo();
                refThis.name = "this";
                refThis.type = RefsInfo.RefType.FIELD;
                refs.put(thisObject, refThis);
                Set<Map.Entry<String, RefsInfo>> entries = refMap.entrySet();
                for (Map.Entry<String, RefsInfo> entry : entries) {
                    String key = entry.getKey();
                    RefsInfo value = entry.getValue();
                    if (value.type.equals(RefsInfo.RefType.ARG)) {
                        refs.put(argMap.get(key), value);
                    } else if (value.type.equals(RefsInfo.RefType.FIELD)) {
                        Field field = clazz.getDeclaredField(value.name);
                        field.setAccessible(true);
                        Object feildValue = field.get(thisObject);
                        refs.put(feildValue, value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
