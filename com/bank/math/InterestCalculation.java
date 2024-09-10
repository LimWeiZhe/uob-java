package com.bank.math;

public class InterestCalculation {
    public double calculateInterest(double principal, double interest, int term){
        return principal * Math.pow(1.0+interest/100.0,term) - principal;
    }
}
