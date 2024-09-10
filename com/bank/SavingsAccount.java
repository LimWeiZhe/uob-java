package com.bank;

import com.bank.math.InterestCalculation;

public class SavingsAccount {
    private String name;
    private double balance;
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double applyCompoundInterest(int term) {
        balance += InterestCalculation.calculateInterest(balance, interestRate, term);
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
}
