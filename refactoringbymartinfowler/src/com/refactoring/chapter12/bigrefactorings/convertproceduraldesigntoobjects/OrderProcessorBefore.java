package com.refactoring.chapter12.bigrefactorings.convertproceduraldesigntoobjects;

/**
 * Convert Procedural Design to Objects - BEFORE Refactoring
 * 
 * The code uses a procedural style with data structures and functions
 * that operate on them. We should convert this to an object-oriented
 * design where data and behavior are encapsulated together.
 */
public class OrderProcessorBefore {
    // Procedural approach: data and behavior are separated
    public static void processOrder(OrderData order) {
        double total = calculateTotal(order);
        applyDiscount(order, total);
        calculateTax(order, total);
        printReceipt(order, total);
    }
    
    private static double calculateTotal(OrderData order) {
        double total = 0;
        for (String item : order.items) {
            total += getItemPrice(item);
        }
        return total;
    }
    
    private static void applyDiscount(OrderData order, double total) {
        if (total > 100) {
            order.discount = total * 0.1;
        }
    }
    
    private static void calculateTax(OrderData order, double total) {
        order.tax = total * 0.08;
    }
    
    private static void printReceipt(OrderData order, double total) {
        System.out.println("Order: " + order.orderId);
        System.out.println("Total: " + total);
    }
    
    private static double getItemPrice(String item) {
        return 10.0; // simplified
    }
}

/**
 * Data structure - no behavior
 */
class OrderData {
    String orderId;
    String[] items;
    double discount;
    double tax;
}

