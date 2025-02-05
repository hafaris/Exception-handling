package com.techademy.assignments0302;

abstract class PaymentMethod {
 protected String accountHolder;

 public PaymentMethod(String accountHolder) {
     this.accountHolder = accountHolder;
 }

 public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
 private double transactionFee = 0.02; // 2% fee

 public CreditCard(String accountHolder) {
     super(accountHolder);
 }

 @Override
 public void processPayment(double amount) {
     double totalAmount = amount + (amount * transactionFee);
     System.out.println(accountHolder + " paid " + totalAmount + " via Credit Card.");
 }
}

class PayTM extends PaymentMethod {
 public PayTM(String accountHolder) {
     super(accountHolder);
 }

 @Override
 public void processPayment(double amount) {
     System.out.println(accountHolder + " paid " + amount + " via PayTM.");
 }
}

public class OnlinePaymentSystem {
 public static void processTransaction(PaymentMethod paymentMethod, double amount) {
     paymentMethod.processPayment(amount); 
 }

 public static void main(String[] args) {
     PaymentMethod cardPayment = new CreditCard("Deepak");
     PaymentMethod paypalPayment = new PayTM("Dileep");

     System.out.println("Processing Payments:");
     processTransaction(cardPayment, 100);
     processTransaction(paypalPayment, 100);
 }
}
