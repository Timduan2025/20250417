package org.example;

import org.example.model.MySecondRunnable;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MySecondRunnable task1 = new MySecondRunnable("下載資料");
        MySecondRunnable task2 = new MySecondRunnable("處理圖片");

        //把任務丟入執行緒裡
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        //執行 執行緒
        thread1.start();
        thread2.start();
        System.out.println("主執行緒運行結束!");
    }
}
