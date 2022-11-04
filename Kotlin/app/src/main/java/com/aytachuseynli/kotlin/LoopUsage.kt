package com.aytachuseynli.kotlin

fun main() {
    ///1,2,3
    for (x in 1..3) {
        println("Loop 1: $x")
    }

    //10 to 20, +5
    for (y in 10..20 step 5){
        println("Loop 2 : $y")
    }

    //20 to 10 , -5
    for (y in 20 downTo 10 step 5){
        println("Loop 3 : $y")
    }

    //1,2,3
    var counter = 1
    while (counter<4){
        println("Loop 4: $counter")
        //1.Yontem
        //counter = counter +1
        //2.Yontem
        //counter+=1
        //3.Yontem
        counter++
    }

    for(z in 7..13 step 3){
        println("Loop 5: $z ")
    }

    var t = 7
    while (t <= 13) {
        println("Loop 6 : $t")
        t+=3
    }

    //1 to 5
    for (i in 1..5){
        if(i==3){
            break
        }
        println("Loop 7: $i")
    }


    //1 to 5
    for (i in 1..5){
        if(i==3){
            continue
        }
        println("Loop 8: $i")
    }


}