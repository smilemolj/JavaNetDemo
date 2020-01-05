package com.smilemolj.javanetdemo.reflect

import java.lang.reflect.Field

object ReflectDemo2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val personclass = Person::class.java
        val fields: Array<Field> = personclass.declaredFields
        fields.indices.forEach { i ->
            println("$i:${fields[i]}")
        }
        val name = personclass.getDeclaredField("name")
        val person = Person("哈哈哈", 18)
//        忽略访问权限修饰符的安全检查，暴力反射
        name.trySetAccessible()
        val value = name.get(person)
        println("value:$value")
    }
}