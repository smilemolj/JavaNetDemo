package com.smilemolj.javanetdemo.stream

object DemoStream1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = arrayListOf<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        list.add(6)
        list.add(7)
        val stream = list.stream()
        println(stream.count())

        val list1 = arrayListOf("喜羊羊", "美羊羊", "大羊羊")
        val stream1 = list1.stream()
        val limit = stream1.limit(1)
        limit.forEach {
            println(it.toString())
        }
    }
}