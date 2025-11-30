package com.refactoring.inlinetemp.multipletemps;

public class Order {
    private double basePrice;
    private double discount;
    
    public Order(double basePrice, double discount) {
        this.basePrice = basePrice;
        this.discount = discount;
    }
    
    public double getBasePrice() {
        return basePrice;
    }
    
    public double getDiscount() {
        return discount;
    }
}

