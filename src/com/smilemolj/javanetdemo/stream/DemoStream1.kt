package com.smilemolj.javanetdemo.stream

import java.util.stream.Stream

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
//        val limit = stream1.limit(2)
//        limit.forEach {
//            println(it)
//        }
        println("---------------------")
        val stream2 = list1.stream()
//        val skip = stream2.skip(1)
//        skip.forEach {
//            println(it)
//        }
        println("---------------------")
        val concat = Stream.concat(stream1, stream2)
        concat.forEach {
            println(it)
        }
    }
}