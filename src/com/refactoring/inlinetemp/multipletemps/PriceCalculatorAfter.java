package com.refactoring.inlinetemp.multipletemps;


/**
 * Example 4: Multiple Temps - AFTER Refactoring
 * 
 * We inline basePrice and discount (simple pass-throughs)
 * But keep subtotal and tax (meaningful intermediate calculations)
 * 
 * KEY CONCEPTS:
 * 
 * SIMPLE PASS-THROUGHS (should be inlined):
 * - Just hold a method result
 * - Don't add semantic value
 * - Example: double basePrice = order.getBasePrice();
 * 
 * MEANINGFUL INTERMEDIATE CALCULATIONS (should be kept):
 * - Represent a business concept
 * - Make the code more readable
 * - Help with debugging
 * - Example: double subtotal = basePrice - discount;
 */
public class PriceCalculatorAfter {
    public double calculateFinalPrice(Order order) {
        // INLINED: basePrice and discount were simple pass-throughs, so we inlined them
        // directly into the calculation. This removes unnecessary variables without
        // losing readability.
        // KEPT: "subtotal" is kept because it represents a meaningful business concept.
        // The name documents what this value means and makes the code self-documenting.
        double subtotal = order.getBasePrice() - order.getDiscount();
        
        // KEPT: "tax" is kept because it represents a meaningful business concept.
        // Keeping it as a variable:
        // 1. Makes the code more readable (we know this is the tax amount)
        // 2. Makes debugging easier (we can inspect the tax value)
        // 3. Makes future changes easier (e.g., if tax calculation becomes more complex)
        double tax = subtotal * 0.08;
        
        // INLINED: finalPrice was only used once in the return statement, so we inlined it.
        // The calculation is still clear: subtotal + tax = final price
        return subtotal + tax;
    }
}

