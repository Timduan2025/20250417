package org.example;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(sum(5));
    }

    public static int factorial(int n) {
        if (n<=1) return 1;
        return n * factorial (n-1);

        }
        public static int sum(int a){
        if (a<=1) return 1;
        return a + sum (a-1);
        }
    }
