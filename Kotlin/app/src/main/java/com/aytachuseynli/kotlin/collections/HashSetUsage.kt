package com.aytachuseynli.kotlin.collections

fun main() {
    //Create
    val fruits = HashSet<String>()

    //Add
    fruits.add("Melon")
    fruits.add("Apple")
    fruits.add("Banana")
    println(fruits)

    fruits.add("New Apple")
    println(fruits)

    //Get value
    println(fruits.elementAt(2))

    println(fruits.size)
    println(fruits.isEmpty())

    for (fruit in fruits) {
        println("Result : $fruit")
    }

    for((index,fruit) in fruits.withIndex()){
        println("$index. -> $fruit")
    }

    fruits.remove("Melon")
    println(fruits)

    fruits.clear()
    println(fruits)
}