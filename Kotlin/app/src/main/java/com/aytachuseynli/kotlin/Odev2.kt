package com.aytachuseynli.kotlin

//Calculate Temperature Conversion
class Temperature {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return  celsius*1.8 + 32
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit -32)/1.8
    }

    fun celsiusToKelvin(celsius: Double): Double{
        return celsius+273
    }

    fun kelvinToCelsius(kelvin: Double): Double{
        return kelvin-273
    }
}

// Calculate Perimeter

class Perimeter {
    fun perimeterRectangle(a: Int, b: Int): Int {
        return 2 * (a + b)
    }

    fun perimeterSquare(c: Int) : Int {
        return 4*c
    }

    fun perimeterTriangle(x: Int, y: Int, z: Int): Int {
        return x + y + z
    }

}

//Calculate factorial

fun factorial(number: Int): Int {
    when (number) {
        0 -> return 1
        else -> return number * factorial(number - 1)
    }
}

//Count letter

fun countLetter(text: String): Int {
    var counter = 0
    for (h in text) {
        if (h == 'a') {
            counter++
        }
    }
    return counter
}

//Calculate Fee

fun countFee(kotaMiktari: Int): Int {
    val kota = 50
    if (kotaMiktari <= kota) {
        return 100
    } else {
        return 100+(kotaMiktari-kota)*4
    }
}

// Calculate salary

fun salary (days: Int): Int{
    val workHours = 8
    if (days * workHours >= 160) {
        return 160 * 10 + (days * workHours - 160) * 20
    } else {
        return  days * workHours * 10
    }
}



//Results
fun main() {
    val temp = Temperature()
    println("Fahrenheit : ${temp.celsiusToFahrenheit(60.0)}")
    println("Celsius : ${temp.fahrenheitToCelsius(60.0)}")
    println("Kelvin : ${temp.celsiusToKelvin(27.5)}")
    println("Celsius : ${temp.kelvinToCelsius(350.5)}")

    val perimeter = Perimeter()
    println("Perimeter Rectangle : ${perimeter.perimeterRectangle(6, 8)}")
    println("Perimeter Square : ${perimeter.perimeterSquare(5)}")
    println("Perimeter Triangle : ${perimeter.perimeterTriangle(4, 8, 9)}")


    println("Factorial : ${factorial(6)}")
    println("Factorial : ${factorial(0)}")


    println(countLetter("fdjcufkgiuhojpiufydtaaaaaaaa"))

    println("Ücret: ${countFee(80)} tl")

    println("Maaş : ${salary(25)} tl")

}


