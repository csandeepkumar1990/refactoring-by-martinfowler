package com.refactoring.inlinetemp.withfinalcheck;


/**
 * Example 6: Using Final to Verify Single Assignment - ORIGINAL
 */
public class ShippingCalculatorOriginal {
    public boolean qualifiesForFreeShipping(Cart cart) {
        double total = cart.getTotal();
        return total > 50.0;
    }
}

