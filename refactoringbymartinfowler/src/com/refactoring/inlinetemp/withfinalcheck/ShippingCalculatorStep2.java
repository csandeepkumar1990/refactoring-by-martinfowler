package com.refactoring.inlinetemp.withfinalcheck;


/**
 * Example 6: Step 2 - Replace the reference
 */
public class ShippingCalculatorStep2 {
    public boolean qualifiesForFreeShipping(Cart cart) {
        final double total = cart.getTotal();
        return cart.getTotal() > 50.0;  // Replaced 'total' with expression
    }
}

