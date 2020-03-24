package com.etz.replay.unit.factory;

import lombok.Data;

@Data
public class LineModel {
    String ident;
    String text;
    String sp;

    public LineModel(String text) {
        this.text = text;
    }

    public LineModel(String text, String sp) {
        this.text = text;
        this.sp = sp;
    }

    public LineModel(String ident, String text, String sp) {
        this.ident = ident;
        this.text = text;
        this.sp = sp;
    }
}
