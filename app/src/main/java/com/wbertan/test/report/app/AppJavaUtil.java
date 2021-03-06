package com.wbertan.test.report.app;

public class AppJavaUtil {

    public String greeting(String name) {
        if (name == null) {
            return "I don't know who you are!";
        } else {
            return "Hello " + name;
        }
    }

}
