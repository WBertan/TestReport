package com.wbertan.demo.lib_c_two;

public class LibCTwoJavaUtil {

    public String greeting(String name) {
        if (name == null) {
            return "I don't know who you are!";
        } else {
            return "Hello " + name;
        }
    }

}
