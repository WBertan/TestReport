package com.wbertan.test.report.app

class AppRobolectricUtil {

    fun greeting(name: String?) = name?.let { "Hello $it" } ?: "I don't know who you are!"

}