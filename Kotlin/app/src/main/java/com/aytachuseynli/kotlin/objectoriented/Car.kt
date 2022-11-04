package com.aytachuseynli.kotlin.objectoriented

class Car(var color: String, var speed: Int,var isRunning: Boolean) {

    init {
        println("Created Object")
    }




    fun getInfo() { //this, super: inheritance
        println("-----------------------")
        println("Color : ${color}")
        println("Speed : ${speed}")
        println("Running : ${isRunning}")
    }

    fun run(){ //Side effect
        isRunning = true
        speed  = 5
    }

    fun stop(){
        isRunning = false
        speed = 0
    }

    fun speedUp(km: Int){
        speed+=km
    }

    fun speedDown(km: Int){
        speed-=km
    }
}