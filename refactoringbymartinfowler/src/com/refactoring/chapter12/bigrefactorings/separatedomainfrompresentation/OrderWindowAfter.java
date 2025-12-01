package com.refactoring.chapter12.bigrefactorings.separatedomainfrompresentation;

/**
 * Separate Domain from Presentation - AFTER Refactoring
 * 
 * The domain logic has been separated into an OrderCalculator class.
 * The UI now only handles presentation, delegating business logic
 * to the domain layer. This makes the code more testable and reusable.
 */
public class OrderWindowAfter {
    private String customerName;
    private String orderTotal;
    private OrderCalculator calculator = new OrderCalculator();
    
    public void calculateTotal() {
        // Presentation logic only
        String name = customerName;
        double total = calculator.calculateTotal(name);
        orderTotal = String.valueOf(total);
    }
}

/**
 * Domain layer - contains business logic
 * Can be tested independently and reused in other contexts
 */
class OrderCalculator {
    public double calculateTotal(String customerName) {
        // Business logic separated from presentation
        if (customerName.startsWith("VIP")) {
            return 100 * 0.9; // 10% discount for VIP
        } else {
            return 100;
        }
    }
}

