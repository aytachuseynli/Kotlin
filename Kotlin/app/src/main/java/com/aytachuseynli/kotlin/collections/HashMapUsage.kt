package com.aytachuseynli.kotlin.collections

fun main() {
    val countryCode = HashMap<Int, String>()

    //Add
    countryCode.put(90, "TURKEY")
    countryCode[99] = "AZERBAIJAN"
    println(countryCode)


    //Update
    countryCode[90] = "NEW TURKEY"
    println(countryCode)

    //Get value
    println(countryCode.get(90))
    println(countryCode[99])

    println(countryCode.size)
    println(countryCode.isEmpty())

    for ((key, value) in countryCode) {
        println("$key -> $value")
    }

    countryCode.remove(90)
    println(countryCode)

    countryCode.clear()
    println(countryCode)
}