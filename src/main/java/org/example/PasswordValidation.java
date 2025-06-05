package org.example;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password: ");
        if (scanner.hasNext()) {
            String pwd = scanner.next().trim();
            if (pwd.length() < 8 || pwd.length() > 20) {
                throw new LengthException("The length of password is not enough.");
            }
            String regex = "(.*[a-z].*)" + "(.*[A-Z].*)";
            if (!pwd.matches(regex)) {
                throw new IllegalArgumentException("The style of password is not satisfied.");
            }

            System.out.println("Password is: " + pwd);
        }
    }
}
