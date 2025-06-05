package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Hint:
        // 1. Use Random to create 1 ~ 100
        // 2. Use do-while code to create the program
        // 3. Compare input and secret and give a hint
        // 4. only 5 attempts
        Random random = new Random();
        int secret = random.nextInt (100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = 0;
        final int MAX_ATTEMPTS = 5;

        System.out.println("GuessNumber: Game started!!!");


        do {
            System.out.println("Your guess is:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("太小");
            } else if (guess > secret) {
                System.out.println("太大");
            }
            System.out.println("剩餘次數: " + (MAX_ATTEMPTS - attempts) );
        } while (guess != secret && attempts < MAX_ATTEMPTS);

        if (guess == secret) {
            System.out.println("Congrat!!你嘗試了: " + attempts + "次");
        } else {
            System.out.println("GuessNumber: Game Over!!!正確數字為:" + secret);
        }
        }
}
