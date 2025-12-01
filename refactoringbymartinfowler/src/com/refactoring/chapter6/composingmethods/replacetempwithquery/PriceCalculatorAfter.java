package com.refactoring.chapter6.composingmethods.replacetempwithquery;

/**
 * Replace Temp with Query - AFTER Refactoring
 * 
 * The temporary variables have been replaced with query methods.
 * This makes the code more reusable and easier to extract further if needed.
 */
public class PriceCalculatorAfter {
    private Order _order;
    
    public PriceCalculatorAfter(Order order) {
        this._order = order;
    }
    
    double getPrice() {
        return basePrice() * discountFactor();
    }
    
    private int basePrice() {
        return _order.getQuantity() * (int)_order.getItemPrice();
    }
    
    private double discountFactor() {
        if (basePrice() > 1000) return 0.95;
        else return 0.98;
    }
}

