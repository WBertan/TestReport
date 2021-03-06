package com.wbertan.test.lib_a

class LibAKotlinUtil {

    fun greeting(name: String?) = name?.let { "Hello $it" } ?: "I don't know who you are!"

}