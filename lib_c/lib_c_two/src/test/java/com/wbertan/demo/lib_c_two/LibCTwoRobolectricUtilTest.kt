package com.wbertan.demo.lib_c_two

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28])
class LibCTwoRobolectricUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibCTwoRobolectricUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibCTwoRobolectricUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}