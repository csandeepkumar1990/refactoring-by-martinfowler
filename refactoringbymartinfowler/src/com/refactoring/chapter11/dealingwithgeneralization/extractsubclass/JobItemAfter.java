package com.refactoring.chapter11.dealingwithgeneralization.extractsubclass;

/**
 * Extract Subclass - AFTER Refactoring
 * 
 * The LaborItem subclass has been extracted to handle labor-specific behavior.
 * This eliminates the conditional logic and makes the code more maintainable.
 */
public class JobItemAfter {
    private int _unitPrice;
    private int _quantity;
    
    public JobItemAfter(int unitPrice, int quantity) {
        _unitPrice = unitPrice;
        _quantity = quantity;
    }
    
    public int getTotalPrice() {
        return getUnitPrice() * _quantity;
    }
    
    public int getUnitPrice() {
        return _unitPrice;
    }
    
    public int getQuantity() {
        return _quantity;
    }
}

class LaborItem extends JobItemAfter {
    private Employee _employee;
    
    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        _employee = employee;
    }
    
    public int getUnitPrice() {
        return _employee.getRate();
    }
    
    public Employee getEmployee() {
        return _employee;
    }
}


