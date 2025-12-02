package com.refactoring.chapter8.organizingdata.changevaluetoreference;

/**
 * Demonstration of the difference between value objects and reference objects
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== BEFORE (Value Objects) ===");
        // Each call to create() returns a NEW instance
        Customer c1 = Customer.create("John");
        Customer c2 = Customer.create("John");
        System.out.println("Same name 'John':");
        System.out.println("c1 == c2? " + (c1 == c2)); // false - different objects!
        System.out.println("c1.equals(c2)? " + (c1.equals(c2))); // false (no equals override)
        
        OrderBefore order1 = new OrderBefore("John");
        OrderBefore order2 = new OrderBefore("John");
        // These orders have DIFFERENT Customer instances, even though same name
        
        System.out.println("\n=== AFTER (Reference Objects) ===");
        // First, load customers into the registry
        Customer.loadCustomers();
        
        // Now getNamed() returns the SAME instance
        Customer c3 = Customer.getNamed("Lemon Car Hire");
        Customer c4 = Customer.getNamed("Lemon Car Hire");
        System.out.println("Same name 'Lemon Car Hire':");
        System.out.println("c3 == c4? " + (c3 == c4)); // true - same object!
        
        OrderAfter order3 = new OrderAfter("Lemon Car Hire");
        OrderAfter order4 = new OrderAfter("Lemon Car Hire");
        // These orders share the SAME Customer instance
    }
}

