package org.example;

import org.example.model.MyFirstThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyFirstThread thread1 = new MyFirstThread("A");
        MyFirstThread thread2 = new MyFirstThread("B");

        //啟動執行緒必須呼叫start()，並非run()
        thread1.start();
        thread2.start();
        System.out.println("主執行緒運行結束!");
    }
}
