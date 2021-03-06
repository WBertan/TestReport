package com.wbertan.test.lib_a;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibAJavaUtilTest {

    @Test
    public void testWithNull() {
        String expectedResult = "I don't know who you are!";
        String result = new LibAJavaUtil().greeting(null);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWithName() {
        String expectedResult = "Hello asas";
        String result = new LibAJavaUtil().greeting("asas");
        assertEquals(expectedResult, result);
    }

}