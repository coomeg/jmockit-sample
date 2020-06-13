package com.example.jmockit;

public class Sample {

    public String getLegth(String str) {
        output(str);
        output(str.length() + "文字");
        return str.length() + "文字";
    }

    protected void output(String value) {
        System.out.println(value);
    }
}
