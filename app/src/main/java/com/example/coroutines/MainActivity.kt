package com.example.coroutines


import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
fun main() {
    println("main thread start")
    test()
    println("main thread end")
}
fun test() = runBlocking {
    println("start")
    launch{
        delay(5000L)
        println("hello from coroutines")
    }
    println("end")
}