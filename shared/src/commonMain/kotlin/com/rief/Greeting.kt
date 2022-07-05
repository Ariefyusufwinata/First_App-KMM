package com.rief

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}