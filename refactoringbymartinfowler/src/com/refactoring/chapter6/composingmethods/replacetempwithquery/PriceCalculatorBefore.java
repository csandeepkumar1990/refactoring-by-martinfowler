package com.refactoring.chapter6.composingmethods.replacetempwithquery;

/**
 * Replace Temp with Query - BEFORE Refactoring
 * 
 * Temporary variables are local and can only be seen in the context of the method.
 * By replacing the temp with a query method, any method in the class can access the information.
 */
public class PriceCalculatorBefore {
    private Order _order;
    
    public PriceCalculatorBefore(Order order) {
        this._order = order;
    }
    
    double getPrice() {
        int basePrice = _order.getQuantity() * (int)_order.getItemPrice();
        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}

