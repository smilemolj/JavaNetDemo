package com.smilemolj.javanetdemo;

import java.io.IOException;
import java.io.OutputStream;

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
}
