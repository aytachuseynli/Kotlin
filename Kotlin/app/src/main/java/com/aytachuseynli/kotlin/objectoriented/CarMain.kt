package com.aytachuseynli.kotlin.objectoriented

fun main() {
    //Create object

    val bmw = Car("Red", 100, true)

    //Get value
   bmw.getInfo()

    //Set value
    bmw.speed = 50
    bmw.getInfo()
    bmw.stop()
    bmw.getInfo()
    bmw.run()
    bmw.getInfo()
    bmw.speedUp(100 )
    bmw.getInfo()



    val sahin = Car("White", 0,  false)

    sahin.getInfo()
    sahin.run()
    sahin.getInfo()
    sahin.speedUp(30)
    sahin.getInfo()
    sahin.speedDown(10)
    sahin.getInfo()

}