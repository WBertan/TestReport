package com.wbertan.test.lib_b;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibBJavaUtilTest {

    @Test
    public void testWithNull() {
        String expectedResult = "I don't know who you are!";
        String result = new LibBJavaUtil().greeting(null);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWithName() {
        String expectedResult = "Hello asas";
        String result = new LibBJavaUtil().greeting("asas");
        assertEquals(expectedResult, result);
    }

}