package com.wbertan.demo.lib_c_one;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibCOneJavaUtilTest {

    @Test
    public void testWithNull() {
        String expectedResult = "I don't know who you are!";
        String result = new LibCOneJavaUtil().greeting(null);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWithName() {
        String expectedResult = "Hello asas";
        String result = new LibCOneJavaUtil().greeting("asas");
        assertEquals(expectedResult, result);
    }

}