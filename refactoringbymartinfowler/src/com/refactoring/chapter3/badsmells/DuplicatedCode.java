package com.refactoring.chapter3.badsmells;

/**
 * Chapter 3: Bad Smells in Code - Duplicated Code
 * 
 * SMELL: The same code structure appears in multiple places.
 * 
 * SOLUTION: Extract the duplicated code into a method or class.
 * 
 * Example: Two methods have similar code for calculating discount
 */
public class DuplicatedCode {
    // BEFORE: Duplicated discount calculation
    public double calculateRegularDiscount(double price) {
        if (price > 100) {
            return price * 0.1; // 10% discount
        }
        return 0;
    }
    
    public double calculatePremiumDiscount(double price) {
        if (price > 100) {
            return price * 0.1; // 10% discount - DUPLICATED!
        }
        return 0;
    }
    
    // AFTER: Extract method to eliminate duplication
    public double calculateRegularDiscountAfter(double price) {
        return applyDiscount(price);
    }
    
    public double calculatePremiumDiscountAfter(double price) {
        return applyDiscount(price);
    }
    
    private double applyDiscount(double price) {
        if (price > 100) {
            return price * 0.1;
        }
        return 0;
    }
}

