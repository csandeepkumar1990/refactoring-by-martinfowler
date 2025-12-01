package com.refactoring.chapter6.composingmethods.extractmethod.usinglocalvariables;

/**
 * Supporting Order class for Extract Method examples
 */
public class Order {
    private double amount;
    
    public Order(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

