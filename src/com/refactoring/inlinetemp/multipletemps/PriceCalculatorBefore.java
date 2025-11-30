package com.refactoring.inlinetemp.multipletemps;


/**
 * Example 4: Multiple Temps - BEFORE Refactoring
 * 
 * When you have multiple temps, you don't have to inline all of them.
 * Only inline the ones that are simple pass-throughs.
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
public class PriceCalculatorBefore {
    public double calculateFinalPrice(Order order) {
        // SIMPLE PASS-THROUGH: Just holds a method result, adds no semantic value
        // Should be INLINED - it's only used once and doesn't represent a meaningful concept
        double basePrice = order.getBasePrice();
        
        // SIMPLE PASS-THROUGH: Just holds a method result, adds no semantic value
        // Should be INLINED - it's only used once and doesn't represent a meaningful concept
        double discount = order.getDiscount();
        
        // MEANINGFUL CALCULATION: Represents a business concept (subtotal after discount)
        // Should be KEPT - the name "subtotal" documents what this value means
        double subtotal = basePrice - discount;
        
        // MEANINGFUL CALCULATION: Represents a business concept (tax amount)
        // Should be KEPT - the name "tax" documents what this value means and makes debugging easier
        double tax = subtotal * 0.08;
        
        // MEANINGFUL CALCULATION: Represents final price, but only used once in return
        // Could be INLINED since it's only used once, but keeping it is also fine for clarity
        double finalPrice = subtotal + tax;
        return finalPrice;
    }
}

