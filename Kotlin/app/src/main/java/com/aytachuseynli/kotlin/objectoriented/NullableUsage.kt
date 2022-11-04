package com.aytachuseynli.kotlin.objectoriented

fun main() {
    //Definition
    var str: String? = null

    str = "Hello"

    //Usage 1
    println("Usage 1: ${str?.trim()}")

    //Usage 2
    //println("Usage 2 : ${str!!.trim()}")

    //Usage 3
    if (str != null){
        println("Usage 3: ${str.trim()}")

    }else{
        println("str is null")
    }
    //Usage 4
    str?.let{
        println("Usage 4: ${it.trim()}")
    }

}