package com.etz.replay.unit.classmap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassManager {
    public static final Map<Class, Map<String, ObjectInfo>> CLASSMAP = new ConcurrentHashMap<>();
    public static final Map<Object, Map<Object, ObjectInfo>> OBJECTMAP = new ConcurrentHashMap<>();

    public static void initClassMap(Class... clazz) {
        for (Class aClass : clazz) {
            Field[] declaredFields = aClass.getDeclaredFields();
            CLASSMAP.putIfAbsent(aClass, new HashMap<>());
            Map<String, ObjectInfo> map = CLASSMAP.get(aClass);
            for (Field declaredField : declaredFields) {
                ObjectInfo objectInfo = new ObjectInfo();
                objectInfo.setDeclaredType(declaredField.getType());
                objectInfo.setType(ObjectInfo.Type.FIELD);
                String name = declaredField.getName();
                objectInfo.setName(name);
                map.put(name, objectInfo);
            }

        }

    }

}
