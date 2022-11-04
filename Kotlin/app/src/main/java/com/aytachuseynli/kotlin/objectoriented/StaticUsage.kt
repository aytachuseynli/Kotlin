package com.aytachuseynli.kotlin.objectoriented

fun main() {
    val a = AClass()

    //Classic Usage
   // println(a.x)
    //a.method()

    //Virtual Object
   // println(AClass().x)
   // AClass().method()

    println(AClass.x)
    AClass.method()


}