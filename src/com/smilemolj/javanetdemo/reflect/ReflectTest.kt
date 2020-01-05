package com.smilemolj.javanetdemo.reflect

import java.io.InputStream
import java.util.*

object ReflectTest {
    @JvmStatic
    fun main(args: Array<String>) {
//        val person = Person("xihuanni", 20)
//        person.eat()
        val pro = Properties()
        val reflectclass = ReflectTest::class.java
        val `is` = reflectclass.getResourceAsStream("pro.properties")
        pro.load(`is`)

        val className = pro.getProperty("className")
        val methodName = pro.getProperty("methodName")

        val cls = Class.forName(className)
        val constructor = cls.constructors[0]
        constructor.trySetAccessible()
        val newInstance = constructor.newInstance("xihuanni", 16)
        val method = cls.getMethod(methodName)
        method.trySetAccessible()
        method.invoke(newInstance)
    }
}