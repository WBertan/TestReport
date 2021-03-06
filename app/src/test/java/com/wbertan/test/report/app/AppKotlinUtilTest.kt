package com.wbertan.test.report.app

import org.junit.Assert.assertEquals
import org.junit.Test

class AppKotlinUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = AppKotlinUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = AppKotlinUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}