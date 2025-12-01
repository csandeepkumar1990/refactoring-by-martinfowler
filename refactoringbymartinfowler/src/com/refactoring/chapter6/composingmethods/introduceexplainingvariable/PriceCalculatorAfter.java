package com.refactoring.chapter6.composingmethods.introduceexplainingvariable;

/**
 * Introduce Explaining Variable - AFTER Refactoring
 * 
 * The complex expression has been broken down into well-named temporary variables
 * that explain what each part of the calculation means.
 */
public class PriceCalculatorAfter {
    private Order _order;
    
    public PriceCalculatorAfter(Order order) {
        this._order = order;
    }
    
    double price() {
        final double basePrice = _order.getQuantity() * _order.getItemPrice();
        final double quantityDiscount = Math.max(0, _order.getQuantity() - 500) * _order.getItemPrice() * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
    }
}

