package com.aytachuseynli.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str: String? = null
    lateinit var str1: String
    var number = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str1 = "Hello"
        println(str1)
    }
}