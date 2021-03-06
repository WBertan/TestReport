package com.wbertan.test.lib_a

class LibARobolectricUtil {

    fun greeting(name: String?) = name?.let { "Hello $it" } ?: "I don't know who you are!"

}