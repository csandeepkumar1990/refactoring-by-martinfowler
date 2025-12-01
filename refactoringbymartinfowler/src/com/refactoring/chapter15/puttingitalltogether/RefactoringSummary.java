package com.refactoring.chapter15.puttingitalltogether;

/**
 * Chapter 15: Putting It All Together
 * 
 * This chapter summarizes the key concepts and provides guidance
 * on how to apply refactoring in practice.
 * 
 * KEY TAKEAWAYS:
 * 
 * 1. REFACTORING IS A DISCIPLINE:
 *    - Not just about cleaning code
 *    - A systematic approach to improving design
 *    - Requires practice and patience
 * 
 * 2. THE REFACTORING CATALOG:
 *    - Over 70 refactorings documented
 *    - Each with clear mechanics
 *    - Examples show before/after
 *    - Organized by problem area
 * 
 * 3. WHEN TO REFACTOR:
 *    - When adding features (refactor first)
 *    - When fixing bugs
 *    - During code reviews
 *    - When you see code smells
 * 
 * 4. HOW TO REFACTOR:
 *    - Write tests first
 *    - Make small, incremental changes
 *    - Run tests frequently
 *    - Commit working code
 * 
 * 5. REFACTORING PATTERNS:
 *    - Extract Method (most common)
 *    - Move Method
 *    - Replace Conditional with Polymorphism
 *    - Extract Class
 * 
 * EXAMPLE: Complete refactoring workflow
 */
public class RefactoringSummary {
    
    /**
     * COMPLETE REFACTORING WORKFLOW:
     * 
     * 1. IDENTIFY THE SMELL
     *    - Long method
     *    - Duplicated code
     *    - Large class
     *    - etc.
     * 
     * 2. CHOOSE THE REFACTORING
     *    - Consult the catalog
     *    - Pick the appropriate refactoring
     *    - Understand the mechanics
     * 
     * 3. PREPARE
     *    - Write tests
     *    - Ensure tests pass
     *    - Commit current state
     * 
     * 4. REFACTOR
     *    - Follow the mechanics step by step
     *    - Run tests after each step
     *    - Fix any issues immediately
     * 
     * 5. VERIFY
     *    - All tests pass
     *    - Code is cleaner
     *    - Behavior unchanged
     * 
     * 6. COMMIT
     *    - Commit the refactored code
     *    - Write clear commit message
     */
    
    /**
     * EXAMPLE: Refactoring a long method
     * 
     * BEFORE: Long method with multiple responsibilities
     */
    public void processOrderBefore(Order order) {
        // Validate
        if (order == null) throw new IllegalArgumentException();
        if (order.items.isEmpty()) throw new IllegalArgumentException();
        
        // Calculate
        double total = 0;
        for (Item item : order.items) {
            total += item.price;
        }
        if (total > 100) total *= 0.9;
        
        // Process
        order.status = "Processed";
        order.total = total;
        
        // Notify
        RefactoringSummaryHelper.sendEmail(order.customer.email, "Order processed: " + total);
    }
    
    /**
     * AFTER: Broken down into focused methods
     */
    public void processOrderAfter(Order order) {
        validateOrder(order);
        double total = calculateTotal(order);
        total = applyDiscount(total);
        processOrder(order, total);
        notifyCustomer(order, total);
    }
    
    private void validateOrder(Order order) {
        if (order == null) throw new IllegalArgumentException();
        if (order.items.isEmpty()) throw new IllegalArgumentException();
    }
    
    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.items) {
            total += item.price;
        }
        return total;
    }
    
    private double applyDiscount(double total) {
        return total > 100 ? total * 0.9 : total;
    }
    
    private void processOrder(Order order, double total) {
        order.status = "Processed";
        order.total = total;
    }
    
    private void notifyCustomer(Order order, double total) {
        RefactoringSummaryHelper.sendEmail(order.customer.email, "Order processed: " + total);
    }
    
    /**
     * FINAL THOUGHTS:
     * - Refactoring is a skill that improves with practice
     * - Start small, build confidence
     * - Use tools when available
     * - Always have tests
     * - Refactor regularly, not just when code is broken
     */
}

// Supporting classes
class Order {
    java.util.List<Item> items;
    String status;
    double total;
    Customer customer;
}

class Item {
    double price;
}

class Customer {
    String email;
}

// Placeholder method
class RefactoringSummaryHelper {
    static void sendEmail(String email, String message) {}
}

