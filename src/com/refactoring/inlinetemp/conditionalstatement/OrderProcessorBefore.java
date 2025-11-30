package com.refactoring.inlinetemp.conditionalstatement;


/**
 * Example 3: Temp in Conditional Statement - BEFORE Refactoring
 * 
 * A temp variable used in an if statement. If it's only used once,
 * we can inline it directly into the condition.
 */
public class OrderProcessorBefore {
    public boolean canProcessOrder(Order order) {
        boolean isValid = order.isValid();
        if (isValid) {
            return processOrder(order);
        }
        return false;
    }
    
    private boolean processOrder(Order order) {
        // Process the order
        return true;
    }
}

