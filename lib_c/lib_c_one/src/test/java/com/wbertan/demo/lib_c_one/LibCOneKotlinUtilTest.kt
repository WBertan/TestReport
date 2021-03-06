package com.wbertan.demo.lib_c_one

import org.junit.Assert.assertEquals
import org.junit.Test

class LibCOneKotlinUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibCOneKotlinUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibCOneKotlinUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}