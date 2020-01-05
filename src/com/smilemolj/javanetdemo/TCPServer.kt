package com.smilemolj.javanetdemo

import java.net.ServerSocket

object TCPServer {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val server = ServerSocket(8888)
        val socket = server.accept()
        val inputStream = socket.getInputStream()
        val bytes = ByteArray(1024)
        val len = inputStream.read(bytes)
        println(String(bytes, 0, len))
        val outputStream = socket.getOutputStream()
        outputStream.write("收到，谢谢啦".toByteArray())
        socket.close()
        server.close()
    }
}