package com.refactoring.inlinetemp.singleuseincalculation;

/**
 * Supporting Order class for Example 2
 */
public class Order {
    private double subtotal;
    private double discount;
    
    public Order(double subtotal, double discount) {
        this.subtotal = subtotal;
        this.discount = discount;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public double getDiscount() {
        return discount;
    }
}

