package com.aytachuseynli.kotlin.objectoriented.override

fun main() {
    val animal = Animal ()
    val mammal = Mammal()
    val cat = Cat()
    val dog = Dog()

    animal.makeNoise() //Own function , no inheritance
    mammal.makeNoise() //Inheritance , reach Animal function
    cat.makeNoise() // Inheritance, own function
    dog.makeNoise() //Inheritance, own function


    //Overloading : no inheritance
    //Override: precondition : inheritance
}