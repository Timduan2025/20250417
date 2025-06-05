package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.ThreadPoolDemo.printName;

public class LambaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Tom", "Charlie");
        //for 遍歷
        for (String name : names) {
            printName(name);
        }
        // lamba
        names.forEach((name) -> System.out.println(name));
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}
