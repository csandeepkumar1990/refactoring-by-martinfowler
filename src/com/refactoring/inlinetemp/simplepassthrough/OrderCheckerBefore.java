package com.refactoring.inlinetemp.simplepassthrough;

/**
 * Example 1: Simple Pass-Through Temp - BEFORE Refactoring
 * 
 * This is the most basic case - a temp variable that just holds a method result
 * and is used once. The temp doesn't add any value, so we inline it.
 */
public class OrderCheckerBefore {
    public boolean isExpensive(Order anOrder) {
        double basePrice = anOrder.basePrice();
        return (basePrice > 1000);
    }
}

