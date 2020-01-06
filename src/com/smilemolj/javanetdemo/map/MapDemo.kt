package com.smilemolj.javanetdemo.map

object MapDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val map = HashMap<String, String>()
//        val put1 = map.put("xihuanni", "hhh")
//        println(put1)
//        println("put1:$map")
//        val put2 = map.put("xihuanni", "nihao")
//        println(put2)
//        println("put2:$map")

        map["8"] = "发"
        map["88"] = "发发"
        map["888"] = "发发发"
        map["lalala"]="啦啦啦"
        map["hahaha"]="哈哈哈"
        println(map)
        map.remove("lalala")
        println(map)
        println(map["888"])
        println(map.containsKey("hahaha"))
        println(map.containsKey("ha"))


    }
}