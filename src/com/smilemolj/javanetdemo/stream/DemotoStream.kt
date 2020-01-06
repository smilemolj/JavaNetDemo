package com.smilemolj.javanetdemo.stream

import java.util.ArrayList
import java.util.HashMap
import java.util.stream.Stream

object DemotoStream {
    @JvmStatic
    fun main(args: Array<String>) {
        val list: MutableList<String> = ArrayList()
        val stream = list.stream()

        val hashSet = HashSet<String>()
        val stream1 = hashSet.stream()

        val hashMap = HashMap<String, String>()
        val keys = hashMap.keys
        val stream2 = keys.stream()

        val of = Stream.of(1, 2, 3, 4, 5, 6)

    }
}