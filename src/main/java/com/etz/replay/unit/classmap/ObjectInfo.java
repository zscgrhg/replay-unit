package com.etz.replay.unit.classmap;

import lombok.Data;
import lombok.experimental.Delegate;

@Data
public class ObjectInfo {
    @Delegate
    final ObjectInfoProtype objectInfoProtype;
    Object objRef;

}
