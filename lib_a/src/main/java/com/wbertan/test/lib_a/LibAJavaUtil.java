package com.wbertan.test.lib_a;

public class LibAJavaUtil {

    public String greeting(String name) {
        if (name == null) {
            return "I don't know who you are!";
        } else {
            return "Hello " + name;
        }
    }

}
