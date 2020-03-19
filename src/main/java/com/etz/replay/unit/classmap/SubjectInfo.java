package com.etz.replay.unit.classmap;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SubjectInfo {
    final Map<Object, ObjectInfoProtype> refs = new HashMap<>();
    Object subject;
}
