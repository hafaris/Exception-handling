package com.techademy.exception;

//Custom Exception Class
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//BankAccount Class
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful! New balance: $" + balance);
 }

 // Method to check balance
 public void checkBalance() {
     System.out.println("Current balance: $" + balance);
 }
}

public class CustomException {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance = $500

        try {
            account.checkBalance();
            account.withdraw(600); // Attempt to withdraw more than the balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
