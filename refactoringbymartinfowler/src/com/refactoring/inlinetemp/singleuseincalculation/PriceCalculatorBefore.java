package com.refactoring.inlinetemp.singleuseincalculation;


/**
 * Example 2: Temp Used Once in Calculation - BEFORE Refactoring
 * 
 * The temp is used only once in a simple calculation.
 * Inlining makes the code more direct.
 */
public class PriceCalculatorBefore {
    public double calculateTotal(Order order) {
        double discount = order.getDiscount();
        double total = order.getSubtotal() - discount;
        return total;
    }
}

