package com.refactoring.inlinetemp.singleuseincalculation;

/**
 * Example 2: Temp Used Once in Calculation - AFTER Refactoring
 * 
 * The temp has been inlined directly into the return statement.
 */
public class PriceCalculatorAfter {
    public double calculateTotal(Order order) {
        return order.getSubtotal() - order.getDiscount();
    }
}

