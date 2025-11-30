package com.refactoring.inlinetemp.withfinalcheck;


/**
 * Example 6: Step 3 - Remove the declaration (FINAL)
 */
public class ShippingCalculatorFinal {
    public boolean qualifiesForFreeShipping(Cart cart) {
    	
        return cart.getTotal() > 50.0;
        
    }
}

