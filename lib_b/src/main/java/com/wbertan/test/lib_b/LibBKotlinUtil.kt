package com.wbertan.test.lib_b

class LibBKotlinUtil {

    fun greeting(name: String?) = name?.let { "Hello $it" } ?: "I don't know who you are!"

}