package com.wbertan.test.lib_b;

public class LibBJavaUtil {

    public String greeting(String name) {
        if (name == null) {
            return "I don't know who you are!";
        } else {
            return "Hello " + name;
        }
    }

}
