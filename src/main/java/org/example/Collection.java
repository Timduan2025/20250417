package org.example;

import net.datafaker.Faker;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<String> studentNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            studentNames.add(name);
            System.out.println(name);
        }

        for (String name : studentNames) {
            System.out.println(name);
        }

        studentNames.forEach((String names) -> System.out.println(names));

        // array.length
        System.out.println("學生總數:" + studentNames.size());
        // array[0]
        System.out.println("第一位學生:" + studentNames.get(0));
        // array[array.length-1]
        System.out.println("最後一位學生:" + studentNames.get(studentNames.size() - 1));

        String newName = faker.name().fullName();
        System.out.println("將第三位學生改為:" + newName);
        studentNames.set(2, newName);

        System.out.println("移除第五位學生" + studentNames.get(4));
        studentNames.remove(4);

        studentNames.add(studentNames.get(0));
        studentNames.add(studentNames.get(0));
        studentNames.add(studentNames.get(0));
        studentNames.add(studentNames.get(0));
        System.out.println("最終名單為:");
        HashSet<String> newNames = new HashSet<>(studentNames);
        for (String name : studentNames) {
            System.out.println(name);
        }
        System.out.println("最終convertedBack名單為");
        List<String> convertedBack = new ArrayList<>(newNames);
        for (String name : convertedBack) {
            System.out.println(name);
        }
    }
}
