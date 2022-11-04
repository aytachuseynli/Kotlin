package com.aytachuseynli.kotlin.objectoriented.interface_usage

class ClassA: Myinterface {
    override val variable: Int = 10

    override fun method1() {
       println("Method1 run")
    }

    override fun method2(): String {
        return "Method2 run"
    }

}