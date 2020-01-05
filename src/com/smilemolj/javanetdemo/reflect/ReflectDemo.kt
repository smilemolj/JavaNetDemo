package com.smilemolj.javanetdemo.reflect

object ReflectDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val clazz = Class.forName("com.smilemolj.javanetdemo.reflect.Person")
        println(clazz)

        val cls6 = Person::class.java
        println(cls6)

        val person = Person("nihao", 18)
        val javaClass = person.javaClass
        println(javaClass)
    }
}