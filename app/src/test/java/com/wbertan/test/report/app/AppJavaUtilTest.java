package com.wbertan.test.report.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppJavaUtilTest {

    @Test
    public void testWithNull() {
        String expectedResult = "I don't know who you are!";
        String result = new AppJavaUtil().greeting(null);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWithName() {
        String expectedResult = "Hello asas";
        String result = new AppJavaUtil().greeting("asas");
        assertEquals(expectedResult, result);
    }

}