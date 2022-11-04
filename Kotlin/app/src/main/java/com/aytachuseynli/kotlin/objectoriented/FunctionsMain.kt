package com.aytachuseynli.kotlin.objectoriented

fun main() {
    val f = Functions()

    f.greeting1()

    val returnValue = f.greeting2()
    println("Return value : $returnValue")

    f.greeting3("Zeynep")

    val returnSum = f.addition(10,20)
    println("Return Sum: $returnSum")

    f.multiplication(30,2,"Beyza")
}