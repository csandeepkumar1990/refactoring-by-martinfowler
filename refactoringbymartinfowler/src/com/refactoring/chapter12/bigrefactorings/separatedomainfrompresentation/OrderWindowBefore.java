package com.refactoring.chapter12.bigrefactorings.separatedomainfrompresentation;

/**
 * Separate Domain from Presentation - BEFORE Refactoring
 * 
 * The UI class (OrderWindow) contains both presentation logic and
 * domain logic. This makes it hard to test the business logic and
 * reuse it in other contexts (e.g., web interface, API).
 */
public class OrderWindowBefore {
    private String customerName;
    private String orderTotal;
    
    public void calculateTotal() {
        // Domain logic mixed with presentation
        String name = customerName;
        double total = 0;
        
        // Business logic here - should be in domain layer
        if (name.startsWith("VIP")) {
            total = 100 * 0.9; // 10% discount for VIP
        } else {
            total = 100;
        }
        
        // Presentation logic
        orderTotal = String.valueOf(total);
    }
}

