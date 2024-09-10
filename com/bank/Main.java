package com.bank;

public class Main {
    public static void main(String args[]) {
        SavingsAccount account = new SavingsAccount("Jon", 1200, 0.01);
        account.applyCompoundInterest(6); // apply 6 months of compound inteest
        System.out.println("After 6 months of interest =>" + account.getBalance());
     }
}
