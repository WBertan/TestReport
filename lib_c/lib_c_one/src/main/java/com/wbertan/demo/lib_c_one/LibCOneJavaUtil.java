package com.wbertan.demo.lib_c_one;

public class LibCOneJavaUtil {

    public String greeting(String name) {
        if (name == null) {
            return "I don't know who you are!";
        } else {
            return "Hello " + name;
        }
    }

}
