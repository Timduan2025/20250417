package org.example.model;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // if (accountNumber is created 3 months ago) {
        //     throw new IllegalArgumentException("未符合資格");
        // }
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void checkBalance() {
        System.out.println("帳號:" + accountNumber + "，餘額" + balance);
    }
}
