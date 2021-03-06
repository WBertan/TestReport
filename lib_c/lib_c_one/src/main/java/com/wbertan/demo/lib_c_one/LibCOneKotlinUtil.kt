package com.wbertan.demo.lib_c_one

class LibCOneKotlinUtil {

    fun greeting(name: String?) = name?.let { "Hello $it" } ?: "I don't know who you are!"

}