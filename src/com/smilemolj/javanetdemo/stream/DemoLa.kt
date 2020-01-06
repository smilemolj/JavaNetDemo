package com.smilemolj.javanetdemo.stream

import java.util.function.Supplier

object DemoLa {
    @JvmStatic
    fun getString(supplier: Supplier<String>): String {
        return supplier.get()
    }

    @JvmStatic
    fun getMax(supplier: Supplier<Int>): Int {
        return supplier.get()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val string = getString(Supplier { "nihao" })
        println(string)
        println("--------------------")
        val array = intArrayOf(0, 88, 2, 55, 6, 5)

        println(getMax(Supplier {
            var maxvalue = array[0]
            array.indices.forEach { i ->
                if (array[i] > maxvalue)
                    maxvalue = array[i]
            }
            return@Supplier maxvalue
        }))
    }
}