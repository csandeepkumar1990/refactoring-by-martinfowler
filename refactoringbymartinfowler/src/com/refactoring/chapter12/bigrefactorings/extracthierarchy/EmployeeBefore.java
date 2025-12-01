package com.refactoring.chapter12.bigrefactorings.extracthierarchy;

/**
 * Extract Hierarchy - BEFORE Refactoring
 * 
 * A class has grown too large and handles multiple variations through
 * conditional logic. We should extract a hierarchy to handle the variations
 * using polymorphism instead of conditionals.
 */
public class EmployeeBefore {
    private String type; // "Engineer", "Salesman", "Manager"
    private double salary;
    private double commission;
    private double bonus;
    
    public double calculatePay() {
        // Conditional logic for different types
        if ("Engineer".equals(type)) {
            return salary;
        } else if ("Salesman".equals(type)) {
            return salary + commission;
        } else if ("Manager".equals(type)) {
            return salary + bonus;
        }
        return 0;
    }
    
    public String getDescription() {
        if ("Engineer".equals(type)) {
            return "Technical professional";
        } else if ("Salesman".equals(type)) {
            return "Sales professional";
        } else if ("Manager".equals(type)) {
            return "Management professional";
        }
        return "";
    }
}

