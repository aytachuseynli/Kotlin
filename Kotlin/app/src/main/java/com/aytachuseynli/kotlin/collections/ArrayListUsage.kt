package com.aytachuseynli.kotlin.collections

fun main() {
    //Create ArrayList
    val fruits = ArrayList<String>()

    //Add
    fruits.add("Melon")//0.
    fruits.add("Apple")//1.
    fruits.add("Banana")//2.
    println(fruits)

    //Update
    fruits[1] = "New Apple"
    println(fruits)

    //Insert
    fruits.add(1, "Orange")
    println(fruits)

    //Get value
    println(fruits.get(2))
    println(fruits[3])


    println("Size : ${fruits.count()}")
    println("Size : ${fruits.size}")
    println("Empty Control : ${fruits.isEmpty()}")
    println("Content Control : ${fruits.contains("Melon")}")

    fruits.reverse() //terse cevirir
    println(fruits)

    fruits.sort()  //sort - siralama
    println(fruits)

    for (fruit in fruits) {
        println("Result 1 : $fruit")
    }

    for ((index,fruit) in fruits.withIndex()) { //Swift : enumarated()
        println("$index.-> $fruit")
    }

    fruits.removeAt(2)
    println(fruits)

    fruits.clear()
    println(fruits)
}