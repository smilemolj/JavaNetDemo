package com.smilemolj.javanetdemo.stream

import java.util.ArrayList
import java.util.HashMap
import java.util.stream.Stream

object DemotoStream {
    @JvmStatic
    fun main(args: Array<String>) {
//        val list: MutableList<String> = ArrayList()
//        val stream = list.stream()
//
//        val hashSet = HashSet<String>()
//        val stream1 = hashSet.stream()
//
//        val hashMap = HashMap<String, String>()
//        val keys = hashMap.keys
//        val stream2 = keys.stream()
//
//        val of = Stream.of(1, 2, 3, 4, 5, 6)

        val stream = Stream.of("张三", "李四", "王武", "赵六", "田七")
        val filter = stream.filter {
            it.startsWith("张")
        }
        filter.forEach {
            println(it)
        }

        val stream1 = Stream.of("1", "2", "3", "4", "5")
        val map = stream1.map {
            it.toInt()
        }
        map.forEach {
            println(it)
        }
    }
}