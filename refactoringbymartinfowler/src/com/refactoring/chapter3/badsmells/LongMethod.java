package com.refactoring.chapter3.badsmells;

/**
 * Chapter 3: Bad Smells in Code - Long Method
 * 
 * SMELL: Methods are too long and do too many things.
 * 
 * SOLUTION: Extract Method to break down long methods into smaller, 
 * well-named methods.
 * 
 * Rule of thumb: If you need a comment to explain what a section does,
 * extract it into a method with a name that explains its purpose.
 */
public class LongMethod {
    // BEFORE: Long method that does too much
    public void processOrder(Order order) {
        // Validate order
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
        
        // Calculate total
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        
        // Apply discount
        if (total > 100) {
            total = total * 0.9;
        }
        
        // Send confirmation
        String email = order.getCustomer().getEmail();
        sendEmail(email, "Your order has been processed. Total: " + total);
        
        // Update inventory
        for (Item item : order.getItems()) {
            inventory.decrement(item.getId());
        }
    }
    
    // AFTER: Broken down into smaller methods
    public void processOrderAfter(Order order) {
        validateOrder(order);
        double total = calculateTotal(order);
        total = applyDiscount(total);
        sendConfirmation(order, total);
        updateInventory(order);
    }
    
    private void validateOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
    }
    
    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
    
    private double applyDiscount(double total) {
        if (total > 100) {
            return total * 0.9;
        }
        return total;
    }
    
    private void sendConfirmation(Order order, double total) {
        String email = order.getCustomer().getEmail();
        sendEmail(email, "Your order has been processed. Total: " + total);
    }
    
    private void updateInventory(Order order) {
        for (Item item : order.getItems()) {
            inventory.decrement(item.getId());
        }
    }
    
    // Placeholder methods
    private void sendEmail(String email, String message) {}
    private Inventory inventory = new Inventory();
}

// Supporting classes
class Order {
    public java.util.List<Item> getItems() { return null; }
    public Customer getCustomer() { return null; }
}

class Item {
    public double getPrice() { return 0; }
    public String getId() { return ""; }
}

class Customer {
    public String getEmail() { return ""; }
}

class Inventory {
    public void decrement(String id) {}
}

