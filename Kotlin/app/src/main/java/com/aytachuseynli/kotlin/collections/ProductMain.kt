package com.aytachuseynli.kotlin.collections

fun main() {
    val p1 = Product (1,"Phone", 10000)
    val p2 = Product (2,"Laptop", 20000)
    val p3 = Product (3,"TV", 13000)

    val productList = ArrayList<Product>()

    productList.add(p1)
    productList.add(p2)
    productList.add(p3)

    for (p in productList){
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")

    }

    //Sorting
    println("Price : Low to High")
    //compareBy = Ascending
    val s1 = productList.sortedWith(compareBy{it.price}) //it = product object(p1, p2, p3)
    for (p in s1) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }

   //compareBy = Descending
    println("Price : High to Low")
    val s2 = productList.sortedWith(compareByDescending {it.price}) //it = product object(p1, p2, p3)
    for (p in s2) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }


    println("Name : Low to High")
    //compareBy = Ascending
    val s3 = productList.sortedWith(compareBy{it.name}) //it = product object(p1, p2, p3)
    for (p in s3) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }

    println("Price : High to Low")
    val s4 = productList.sortedWith(compareByDescending {it.name}) //it = product object(p1, p2, p3)
    for (p in s4) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }

    //Filter
    println("Filter 1")
    val f1 = productList.filter { it.price > 11000 && it.price < 15000}
    for (p in f1) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }

    println("Filter 2")
    val f2 = productList.filter { it.name.contains("o") }
    for (p in f2) {
        println("Id : ${p.id} - Name : ${p.name} - Price : ${p.price}$")
    }


}