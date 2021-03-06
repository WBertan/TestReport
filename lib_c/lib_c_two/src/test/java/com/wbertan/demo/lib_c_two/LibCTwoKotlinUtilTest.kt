package com.wbertan.demo.lib_c_two

import org.junit.Assert.assertEquals
import org.junit.Test

class LibCTwoKotlinUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibCTwoKotlinUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibCTwoKotlinUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}