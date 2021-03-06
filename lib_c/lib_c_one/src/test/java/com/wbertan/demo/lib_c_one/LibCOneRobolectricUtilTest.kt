package com.wbertan.demo.lib_c_one

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28])
class LibCOneRobolectricUtilTest {

    @Test
    fun testWithNull() {
        val expectedResult = "I don't know who you are!"
        val result = LibCOneRobolectricUtil().greeting(null)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testWithName() {
        val expectedResult = "Hello asas"
        val result = LibCOneRobolectricUtil().greeting("asas")
        assertEquals(expectedResult, result)
    }

}