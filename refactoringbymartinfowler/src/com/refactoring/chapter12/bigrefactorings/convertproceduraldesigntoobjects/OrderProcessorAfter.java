package com.refactoring.chapter12.bigrefactorings.convertproceduraldesigntoobjects;

/**
 * Convert Procedural Design to Objects - AFTER Refactoring
 * 
 * The procedural code has been converted to an object-oriented design.
 * Data and behavior are now encapsulated together in the Order class.
 * This makes the code more maintainable and follows OOP principles.
 */
public class OrderProcessorAfter {
    public static void processOrder(Order order) {
        order.process();
    }
}

/**
 * Object-oriented approach: data and behavior are together
 */
class Order {
    private String orderId;
    private String[] items;
    private double discount;
    private double tax;
    
    public Order(String orderId, String[] items) {
        this.orderId = orderId;
        this.items = items;
    }
    
    public void process() {
        double total = calculateTotal();
        applyDiscount(total);
        calculateTax(total);
        printReceipt(total);
    }
    
    private double calculateTotal() {
        double total = 0;
        for (String item : items) {
            total += getItemPrice(item);
        }
        return total;
    }
    
    private void applyDiscount(double total) {
        if (total > 100) {
            discount = total * 0.1;
        }
    }
    
    private void calculateTax(double total) {
        tax = total * 0.08;
    }
    
    private void printReceipt(double total) {
        System.out.println("Order: " + orderId);
        System.out.println("Total: " + total);
    }
    
    private double getItemPrice(String item) {
        return 10.0; // simplified
    }
}

