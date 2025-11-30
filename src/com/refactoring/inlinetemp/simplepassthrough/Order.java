package com.refactoring.inlinetemp.simplepassthrough;

/**
 * Supporting Order class for Example 1
 */
public class Order {
    private double basePrice;
    
    public Order(double basePrice) {
        this.basePrice = basePrice;
    }
    
    public double basePrice() {
        return basePrice;
    }
}

