package org.example.model;

public class MyFirstThread extends Thread {
    private String threadName;

    public MyFirstThread(String threadName) {
        this.threadName = threadName;
        System.out.println("建立執行緒:" + threadName);
    }

    @Override
    public void run() {
        System.out.println("執行緒" + threadName + "正在運行...");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("執行緒" + threadName + "數到" + i);
                Thread.sleep(500); //暫停0.5秒
            }
        } catch (InterruptedException e) {
            System.out.println("執行緒" + threadName + "被中斷");
        }
        System.out.println("執行緒" + threadName + "運行結束");
    }
}
