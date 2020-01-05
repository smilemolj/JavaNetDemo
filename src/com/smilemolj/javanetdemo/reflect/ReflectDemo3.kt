package com.smilemolj.javanetdemo.reflect

object ReflectDemo3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val personclass = Person::class.java
        val declaredConstructors = personclass.declaredConstructors
        declaredConstructors.indices.forEach { i->
            println("$i:${declaredConstructors[i]}")
        }
        val person = declaredConstructors[0].newInstance("nihao", 20)
        println("$person")
    }
}