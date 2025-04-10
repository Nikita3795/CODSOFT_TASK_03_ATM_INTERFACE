 package com.nikita.atm;

public class BankAccount {
    private double balance;
    private String accountHolder;
    private String pin;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance, String pin) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Method to verify PIN
    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // Get account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit Successful! New Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawal Successful! Remaining Balance: ₹" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("❌ Insufficient funds! Your balance is ₹" + balance);
        } else {
            System.out.println("❌ Invalid withdrawal amount!");
        }
        return false;
    }
}
