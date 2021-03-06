package com.wbertan.test.lib_b

import org.junit.Assert.assertEquals
import org.junit.Test

class LibBKotlinUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibBKotlinUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibBKotlinUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}