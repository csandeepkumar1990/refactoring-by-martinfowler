package com.refactoring.inlinetemp.simplepassthrough;

/**
 * Example 1: Simple Pass-Through Temp - AFTER Refactoring
 * 
 * The temp variable has been inlined directly into the return statement.
 */
public class OrderCheckerAfter {
    public boolean isExpensive(Order anOrder) {
        return (anOrder.basePrice() > 1000);
    }
}

