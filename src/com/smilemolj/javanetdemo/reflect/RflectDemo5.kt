package com.smilemolj.javanetdemo.reflect

@Pro(className = "com.smilemolj.javanetdemo.reflect.Demo1",methodName = "show")
object RflectDemo5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val annotation = this::class.java.getAnnotation(Pro::class.java)
        val className = annotation.className
        val methodName = annotation.methodName
        println(className)
        println(methodName)
        val cls = Class.forName(className)
        val constructor = cls.getConstructor()
        val newInstance = constructor.newInstance()
        val method = cls.getMethod(methodName)
        method.invoke(newInstance)
    }
}