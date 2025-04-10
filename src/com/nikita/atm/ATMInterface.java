 package com.nikita.atm;

import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a sample user account (Name, Initial Balance, PIN)
        BankAccount userAccount = new BankAccount("Nikita", 5000, "1234");
        ATM atm = new ATM(userAccount);

        System.out.println("🏦 Welcome to the ATM!");
        System.out.print("🔑 Enter your PIN: ");
        String enteredPin = scanner.next();

        // Verify PIN before accessing ATM features
        if (userAccount.verifyPin(enteredPin)) {
            atm.showMenu();
        } else {
            System.out.println("❌ Incorrect PIN! Access Denied.");
        }

        scanner.close();
    }
}
