package com.refactoring.inlinetemp.conditionalstatement;


/**
 * Example 3: Temp in Conditional Statement - AFTER Refactoring
 * 
 * The temp has been inlined directly into the if condition.
 */
public class OrderProcessorAfter {
    public boolean canProcessOrder(Order order) {
        if (order.isValid()) {
            return processOrder(order);
        }
        return false;
    }
    
    private boolean processOrder(Order order) {
        // Process the order
        return true;
    }
}

