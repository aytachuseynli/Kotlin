package com.aytachuseynli.kotlin.objectoriented.inheritance

fun main() {
    val palace = Palace(5, 300)
    val villa = Villa(true, 40)

    println(palace.tower)
    println(palace.window)

    println(villa.garage)
    println(villa.window)

    //Type casting
    //Object oriented type casting
    //Precondition -> Inheritance

    //Upcasting
    val home: Home = Palace(2,100)

    //Downcasting
    val home1 = Home(20)
    val palace1 = home1 as Palace

    //Type control
    val villa1 = Villa(false, 18)
    if (villa1 is Villa) { //Java : instanceOf , Swift is
       println("villa1 is Villa")

    }else {
        println("villa1 is not Villa")

    }
}