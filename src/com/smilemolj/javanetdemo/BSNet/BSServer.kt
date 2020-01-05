package com.smilemolj.javanetdemo.BSNet

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.net.ServerSocket

object BSServer {
    @JvmStatic
    fun main(args: Array<String>) {
        val server = ServerSocket(8080)
        val socket = server.accept()
        val inputStream = socket.getInputStream()
//        val bytes = ByteArray(1024)
//        var len = 0
//        while (inputStream.read(bytes).let { len = it;it != -1 }) {
//            println(String(bytes, 0, len))
//        }
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val readLine = bufferedReader.readLine()
        val split = readLine.split(" ")
        val htmlpath = split[1].substring(1)
        println(File(htmlpath).absolutePath)
        //http://127.0.0.1:8080/web/index.html
        val fileInputStream = FileInputStream(htmlpath)
        val outputStream = socket.getOutputStream()
        outputStream.write("HTTP/1.1 200 OK\r\n".toByteArray())
        outputStream.write("Content-Type:text/html\r\n".toByteArray())
        outputStream.write("\r\n".toByteArray())
        var len = 0
        val bytes = ByteArray(1024)
        while (fileInputStream.read(bytes).let { len = it;it != -1 }) {
            outputStream.write(bytes, 0, len)
        }
        fileInputStream.close()
        socket.close()
        server.close()
    }
}