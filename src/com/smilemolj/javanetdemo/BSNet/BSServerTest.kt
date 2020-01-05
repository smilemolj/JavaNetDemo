package com.smilemolj.javanetdemo.BSNet

import org.junit.After
import org.junit.Before
import org.junit.Test

class BSServerTest {
    @Test
    fun testAdd() {
        println("testAdd")
        val i = 666
//        assertEquals(3,i)
        assert(i==666)
    }

    @Before
    fun init(){
        println("init")
    }

    @After
    fun close(){
        println("close")
    }
}