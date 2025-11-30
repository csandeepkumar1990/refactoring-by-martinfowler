package com.refactoring.inlinetemp.withfinalcheck;


/**
 * Example 6: Step 1 - Add FINAL to verify
 */
public class ShippingCalculatorStep1 {
    public boolean qualifiesForFreeShipping(Cart cart) {
        final double total = cart.getTotal();  // Compiles = good! Only assigned once
        return total > 50.0;
    }
}

