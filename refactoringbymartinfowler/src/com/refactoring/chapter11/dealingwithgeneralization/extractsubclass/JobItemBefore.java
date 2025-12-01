package com.refactoring.chapter11.dealingwithgeneralization.extractsubclass;

/**
 * Extract Subclass - BEFORE Refactoring
 * 
 * The JobItem class has conditional logic based on whether it's a labor item.
 * We should extract a LaborItem subclass to handle labor-specific behavior.
 */
public class JobItemBefore {
    private int _unitPrice;
    private int _quantity;
    private boolean _isLabor;
    private Employee _employee;
    
    public JobItemBefore(int unitPrice, int quantity, boolean isLabor, Employee employee) {
        _unitPrice = unitPrice;
        _quantity = quantity;
        _isLabor = isLabor;
        _employee = employee;
    }
    
    public int getTotalPrice() {
        return getUnitPrice() * _quantity;
    }
    
    public int getUnitPrice() {
        return (_isLabor) ? _employee.getRate() : _unitPrice;
    }
    
    public int getQuantity() {
        return _quantity;
    }
    
    public Employee getEmployee() {
        return _employee;
    }
}

class Employee {
    private int _rate;
    
    public Employee(int rate) {
        _rate = rate;
    }
    
    public int getRate() {
        return _rate;
    }
}

