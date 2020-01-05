package com.smilemolj.javanetdemo.reflect

object ReflectDemo4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val personclass = Person::class.java
        val declaredMethod = personclass.getDeclaredMethod("eat")
        val person = Person("hahaha", 19)
        declaredMethod.trySetAccessible()
        declaredMethod.invoke(person)
        println("-------------------------------")
        val declaredMethod1 = personclass.getDeclaredMethod("eat", String::class.java)
        declaredMethod1.trySetAccessible()
        declaredMethod1.invoke(person, "食物")
    }
}