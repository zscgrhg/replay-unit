package com.etz.replay.unit.factory;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Data
public class SpecModel {
    Long id;
    String fileName;
    String name;
    String method;
    String subjectDecl;
    List<String> mockDecl;
    String action = "1==1";
    String assertDecl = "1==1";
    Set<HashMap.Entry<String, List<LineModel>>> Inputs;
    Set<HashMap.Entry<String, List<LineModel>>> Outputs;
    Set<HashMap.Entry<String, List<LineModel>>> Returned;
}
