package com.smilemolj.javanetdemo

import java.io.FileInputStream
import java.net.Socket

object TCPClient {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
//        val socket = Socket("127.0.0.1", 8888)
//        val os = socket.getOutputStream()
//        os.write("你好服务器".toByteArray())
//        val inputStream = socket.getInputStream()
//        val bytes = ByteArray(1024)
//        val len = inputStream.read(bytes)
//        println(String(bytes, 0, len))
//        socket.close()

        val fileInputStream = FileInputStream("/Users/lijunliang/Desktop/66.jpg")
        val socket = Socket("127.0.0.1", 8888)
        val outputStream = socket.getOutputStream()
        val bytes = ByteArray(1024)
        var len = 0
        while (fileInputStream.read(bytes).let { len = it;it != -1 }) {
            outputStream.write(bytes, 0, len)
        }
        socket.shutdownOutput()

        val inputStream = socket.getInputStream()
        while (inputStream.read(bytes).let { len = it;it != -1 }) {
            println(String(bytes, 0, len))
        }

        fileInputStream.close()
        socket.close()
    }
}