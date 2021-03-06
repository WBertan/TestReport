package com.wbertan.test.lib_a

import org.junit.Assert.assertEquals
import org.junit.Test

class LibAKotlinUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibAKotlinUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibAKotlinUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}