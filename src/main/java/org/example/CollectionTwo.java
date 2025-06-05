package org.example;

import org.example.model.MapExample;
import org.example.model.Student;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionTwo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("佩琪");
        names.add("喬治");
        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Student> students = new HashSet<>();

        HashSet<MapExample> mapexamples = new HashSet<>();
        mapexamples.add(new MapExample("001", "小洺"));
        mapexamples.add(new MapExample("002", "小華"));

        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("001", "佩琪");
        stringHashMap.put("002", "喬治");
        for (String key : stringHashMap.keySet()) {
            System.out.println(stringHashMap.get(key));
        }

        HashSet<String> keyset = new HashSet<>();
        keyset.add("小美");
        keyset.add("小美 ");
        for (String key : keyset) {
            System.out.println(key);
        }
    }
}
