package com.wbertan.demo.lib_c_two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibCTwoJavaUtilTest {

    @Test
    public void testWithNull() {
        String expectedResult = "I don't know who you are!";
        String result = new LibCTwoJavaUtil().greeting(null);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWithName() {
        String expectedResult = "Hello asas";
        String result = new LibCTwoJavaUtil().greeting("asas");
        assertEquals(expectedResult, result);
    }

}