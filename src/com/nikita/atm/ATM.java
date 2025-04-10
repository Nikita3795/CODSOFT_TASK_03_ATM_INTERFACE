package com.nikita.atm;

import java.util.Scanner;

public class ATM {
    private BankAccount userAccount;

    // Constructor to associate an ATM with a bank account
    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    // Show ATM menu for user interaction
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\n💳 Welcome, " + userAccount.getAccountHolder() + "!");

        while (!exit) {
            System.out.println("\n🔹 ATM Menu 🔹");
            System.out.println("1️⃣ Check Balance");
            System.out.println("2️⃣ Deposit Money");
            System.out.println("3️⃣ Withdraw Money");
            System.out.println("4️⃣ Exit");
            System.out.print("👉 Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Your Balance: ₹" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("💵 Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("💸 Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("🚪 Exiting ATM... Thank you for using our service!");
                    exit = true;
                    break;
                default:
                    System.out.println("❌ Invalid option! Please choose again.");
            }
        }
        scanner.close();
    }
}
