package com.etz.replay.unit;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] files = new File("C:\\data\\replay-unit\\src\\test\\groovy\\com\\etz\\pkg20200326214008").listFiles();
        System.out.println(files.length);
    }
}
