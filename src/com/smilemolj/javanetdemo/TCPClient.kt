package com.smilemolj.javanetdemo

import java.net.Socket

object TCPClient {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val socket=Socket("127.0.0.1",8888)
        val os = socket.getOutputStream()
        os.write("你好服务器".toByteArray())
        socket.close()
    }
}