package com.aytachuseynli.kotlin

fun main() {

    val yas = 17
    val isim = "Ahmet"

    if (yas >= 18) {
        println("Yetişkin")
    }else{
        println("Yetiskin degil")
    }

    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else{
        println("Taninmayan kisi")
    }

    val ka = "admin"
    val s = 123456
    if (ka == "admin" && s == 123456){
        println("Hosgeldin")
    }else{
        println("Hatali giris, gule-gule")
    }

    val sayi = 10
    if (sayi == 9 || sayi == 10){
        println("Sayi 9 ve ya 10 dur")
    }else{
        println("Sayi 9 ve ya 10 degildir.")
    }

    //When : Switch

    val gun = 6
    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Carsamba")
        4 -> println("Persembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Boyle bir gun yok")

    }




}