package com.etz.replay.unit.factory;

public class PropLineModel extends LineModel {
    public static final String COMMA = ",";
    String name;

    public PropLineModel(String ident, String name, String text, String sp) {
        super(ident, text, sp);
        this.name = name;
    }

    public PropLineModel(String ident, String name, String text) {
        super(ident, text, COMMA);
        this.name = name;
    }

}
