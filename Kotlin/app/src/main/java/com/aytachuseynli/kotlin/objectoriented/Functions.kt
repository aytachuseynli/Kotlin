package com.aytachuseynli.kotlin.objectoriented

class Functions {
    //void function

    fun greeting1(){
        val result = "Hello Ahmet"
        println(result)
    }

    //return functions
    fun greeting2() : String{
        val result = "Hello Ahmet"
        return result
    }

    //Parameter

    fun greeting3(name: String){
        val result = "Hello $name"
        println(result)
    }

    fun addition(num1: Int, num2: Int) : Int {
        val sum = num1 +  num2
        return sum
    }

    //Overloading
    fun multiplication(num1: Int,num2: Int){
        println("Result : ${num1 * num2}")
    }

    fun multiplication(num1: Double,num2: Double){
        println("Result : ${num1 * num2}")
    }

    fun multiplication(num1: Int,num2: Int, name: String){
        println("Result : ${num1 * num2}- Name: $name")
    }

}