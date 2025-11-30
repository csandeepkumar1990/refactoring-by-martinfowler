package com.refactoring.inlinetemp.conditionalstatement;

/**
 * Supporting Order class for Example 3
 */
public class Order {
    private boolean valid;
    
    public Order(boolean valid) {
        this.valid = valid;
    }
    
    public boolean isValid() {
        return valid;
    }
}

