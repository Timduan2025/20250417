package org.example;

import net.datafaker.Faker;

import java.util.*;

public class ActivityRegistration {
    public static void main(String[] args) {
        Faker faker = new Faker();
        // String[] gender = {"男", "女"};
        Map<String, String> registers = new HashMap<>();
        System.out.println("==活動報名==");
        int numberOfAttender = 100;
        int successfulRegisters = 0;

        for (int i = 0; i < numberOfAttender; i++) {
            // Sting uniqueId = gender[faker.random().nextInt(gender.length)];
            String uniqueId = faker.internet().uuid();
            String userName = faker.funnyName().name();
            System.out.println("嘗試報名:" + userName);

            registers.put(uniqueId, userName);
        }
        System.out.println("==報名結束==");
        System.out.println("嘗試報名人數:" + numberOfAttender);
        System.out.println("成功報名人數:" + registers.size());

        System.out.println("==報名成功列表==");
        if (registers.isEmpty()) {
            System.out.println("沒有人報名成功");
        } else {
            System.out.println(registers);
            // 遍歷所有keys
            for (String key : registers.keySet()) {
                System.out.print(registers.get(key));
            }
            // 遍歷所有key and value
            //for (Map.Entry<String, String> entry : registers.entrySet()) {
            //    System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // 補充: forEach
        // register.forEach((key, value) -> {
        //     System.out.println("key: " + key + ", value: " + value);
        //     })

    }
}
