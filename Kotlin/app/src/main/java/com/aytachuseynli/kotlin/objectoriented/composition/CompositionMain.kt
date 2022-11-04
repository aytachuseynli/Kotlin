package com.aytachuseynli.kotlin.objectoriented.composition

fun main() {
    val c1 =  Category(1, "Dram")
    val c2 = Category(2,"Action")

    val d1 = Director(1, "Quentin Tarantino")
    val d2 = Director(2, "Christopher Nolan")

    val m1 = Movie(1, "Django", 2013,c2, d1)


    //Composition Usage

    println("Movie id : ${m1.movieId}")
    println("Movie name : ${m1.movieName}")

    println("Movie year : ${m1.movieYear}")

    println("Movie category : ${m1.category.categoryName}")
    println("Movie director : ${m1.director.directorName}")


}