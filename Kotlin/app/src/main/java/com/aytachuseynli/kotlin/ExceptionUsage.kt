package com.aytachuseynli.kotlin

import java.lang.Exception

fun main() {
    //Compile error
    //Runtime error ( Exception )

    //Compile Error
    var x = 10
    // x = "hello"

    //Runtime Error
    val a = 20
    val b = 0


    try {
        println("Result : ${ a/b}")
        println("Finish")

    } catch (e:Exception) {
        println("By zero error")
    }
}