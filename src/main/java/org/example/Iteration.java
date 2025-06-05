package org.example;

public class Iteration {
    public static void main(String[] args) {
        // 基本for迴圈:從0印到9
        System.out.println("基本for迴圈:");

        for (int i = 0; i < 10; i++) {
            System.out.println("計數: " + i);
        }

        //計算1到5的總和
        System.out.println("\n計算總和:");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i; //sum += i
            System.out.println("加入 " + i + "，current sum:" + sum);
        }
        System.out.println("最終總和: " + sum);

        // 陣列 array []
        // 非迴圈用法
        String[] fruitbox = {"apple", "banana", "peach", "pineapple"};
        String[] clothes = {"長袖", "短袖", ",."};
        // System.out.println(fruits[0]);
        // System.out.println(fruits[1]);
        // System.out.println(fruits[2]);
        // System.out.println(fruits[3]);

        // 迴圈用法
        for (int i = 0; i < 4; i++) {
            System.out.println(fruitbox[i]);
        }
        for (String fruit : fruitbox) {
            if (fruit.equals("apple")) {
                continue;
            }
            System.out.println(fruit);
        }

        String[] customers = {"Tim", "henry", "jack", "joanne"};

        for (String customer : customers) {
            System.out.println(customer);
        }

        // 宣告 double [] 裡面有6個數字 1.0, 2.0, ... enhance for
        double[] numbers = {1.0, 2.0, 3.4, 5.0, 6.7};
        for (double number : numbers) {
            if (number % 2 != 0) {
                System.out.println("奇數:" + number);
                continue; //跳過當前迴圈中的剩餘程式碼，直接進入下一次迴圈的關鍵字
            }
            System.out.println("偶數:" + number);
        }

        // Pyramid排列
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

