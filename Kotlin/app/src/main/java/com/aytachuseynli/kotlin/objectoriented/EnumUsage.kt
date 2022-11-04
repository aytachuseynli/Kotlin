package com.aytachuseynli.kotlin.objectoriented


fun main() {

}

fun calculatePrice(amount: Int, size: ConservationSize){
    when(size) {
        ConservationSize.SMALL -> println("Price :${amount * 345}")
        ConservationSize.MEDIUM -> println("Price :${amount * 678}")
        ConservationSize.XLARGE -> println("Price :${amount * 953}")


    }
}