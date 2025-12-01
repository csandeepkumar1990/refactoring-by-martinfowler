package com.refactoring.chapter6.composingmethods.introduceexplainingvariable;

/**
 * Introduce Explaining Variable - BEFORE Refactoring
 * 
 * The expression is complex and hard to read. We'll break it down with
 * temporary variables that explain what each part means.
 */
public class PriceCalculatorBefore {
    private Order _order;
    
    public PriceCalculatorBefore(Order order) {
        this._order = order;
    }
    
    double price() {
        // price is base price - quantity discount + shipping
        return _order.getQuantity() * _order.getItemPrice() -
            Math.max(0, _order.getQuantity() - 500) * _order.getItemPrice() * 0.05 +
            Math.min(_order.getQuantity() * _order.getItemPrice() * 0.1, 100.0);
    }
}

