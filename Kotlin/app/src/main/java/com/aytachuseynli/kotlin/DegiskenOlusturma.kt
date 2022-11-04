package com.aytachuseynli.kotlin

fun main() {
    var studentName = "Ahmet"
    var studentAge = 23
    var studentHeight = 1.78
    var studentChar = 'A'
    var studentLessonState = true

    println(studentName)
    println(studentAge)
    println(studentHeight)
    println(studentChar)
    println(studentLessonState)

    var urun_no = 3416
    var urun_adi = "Kol saati"
    var urun_adet = 100
    var urun_fiyat = 149.99
    var urun_tedarikci = "Sahte Rolex"

    println("urun_no : $urun_no")
    println("urun_adi : $urun_adi")
    println("urun_adet : $urun_adet")
    println("urun_fiyat : $urun_fiyat")
    println("urun_tedarikci: $urun_tedarikci")

    var a = 10
    var b = 20
    println("$a x $b : ${ a * b}")

    //Constant : Kotlin ( val ) - Java - Dart ( final ) - Swift ( let )

    var sayi = 30
    println(sayi)

    sayi = 100
    println(sayi)

    val numara = 20
    println(numara)

    //Type Casting

    //Sayisaldan Sayisala
    val i = 42
    val d = 78.56
    val sonuc1  = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //Sayisaldan metine
    val sonuc3 = i.toString() //42
    val sonuc4 = d.toString() //"78.56"
    println(sonuc3)
    println(sonuc4)

    //Metinden Sayisala
    val yazi = "45.t"

    val sonuc5 = yazi.toIntOrNull()

    //1.Yöntem
    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Değişken dönüşüme uygun deyil")
    }

    //2.Yöntem

    sonuc5?.let {
    println(it)
    }


}