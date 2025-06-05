package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " 執行任務:" + i);
            }
        };
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.shutdown();

        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new Thread(task);
        }
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void task() {
        for (int i = 1; i < 3; i++) {

        }
    }
}
