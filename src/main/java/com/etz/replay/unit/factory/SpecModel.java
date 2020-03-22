package com.etz.replay.unit.factory;

import lombok.Data;

import java.util.List;

@Data
public class SpecModel {
    String fileName;
    String name;
    String method;
    String subjectDecl;
    List<String> mockDecl;
    String action = "1==1";
    String assertDecl = "1==1";


}
