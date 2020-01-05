package com.smilemolj.javanetdemo.reflect

data class Person(private var name: String, var age: Int) {
    fun eat() {
        println("eat方法...")
    }
    private fun eat(food: String) {
        println("eat方法...$food")
    }
}

