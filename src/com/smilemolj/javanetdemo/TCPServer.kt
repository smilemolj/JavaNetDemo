package com.smilemolj.javanetdemo

import java.io.File
import java.io.FileOutputStream
import java.net.ServerSocket
import java.util.*

object TCPServer {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
//        val server = ServerSocket(8888)
//        val socket = server.accept()
//        val inputStream = socket.getInputStream()
//        val bytes = ByteArray(1024)
//        val len = inputStream.read(bytes)
//        println(String(bytes, 0, len))
//        val outputStream = socket.getOutputStream()
//        outputStream.write("收到，谢谢啦".toByteArray())
//        socket.close()
//        server.close()
        val server = ServerSocket(8888)
        while (true) {
            val socket = server.accept()
            val inputStream = socket.getInputStream()
            val file = File("/Users/lijunliang/Desktop/server")
            if (!file.exists()) {
                file.mkdirs()
            }
            val filename = "demo" + System.currentTimeMillis() + Random().nextInt(999999) + ".jpg"
            val fileOutputStream = FileOutputStream("$file/$filename")
            val bytes = ByteArray(1024)
            var len = 0
            while (inputStream.read(bytes).let { len = it;it != -1 }) {
                fileOutputStream.write(bytes, 0, len)
            }

            val outputStream = socket.getOutputStream()
            outputStream.write("上传成功啦".toByteArray())
            fileOutputStream.close()
            socket.close()
        }
    }
}