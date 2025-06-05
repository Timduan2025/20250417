package org.example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身高(米): ");
        double height = scanner.nextDouble();
        System.out.println("體重(公斤): ");
        double weight = scanner.nextDouble();
        double BMI = weight / height / height;
        System.out.println("BMI:" + BMI);

        int result;
        if (BMI < 18.5) {
            result = 1;
        } else if (18.5 <= BMI && BMI <= 24) {
            result = 2;
        } else {
            result = 3;
        }

        scanner.close();

        switch (result) {
            case 1:
                System.out.println("過輕");
                break;
            case 2:
                System.out.println("正常");
                break;
            case 3:
                System.out.println("過重");
                break;
        }
    }
}
