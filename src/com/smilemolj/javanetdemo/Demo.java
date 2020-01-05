package com.smilemolj.javanetdemo;

import com.smilemolj.javanetdemo.reflect.Person;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class Demo {
    public void javatokotlin(){
        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
        try {
            os.write("你好服务器".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Field[] fields= Person.class.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
    }
}
