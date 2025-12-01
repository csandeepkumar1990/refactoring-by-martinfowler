package com.refactoring.chapter11.dealingwithgeneralization.extractsuperclass;

/**
 * Extract Superclass - AFTER Refactoring
 * 
 * The common code has been extracted into a Party superclass.
 * Both Employee and Department now extend Party, eliminating duplication.
 */
class EmployeeAfter extends Party {
    private String _id;
    private int _annualCost;
    
    public EmployeeAfter(String name, String id, int annualCost) {
        super(name);
        _id = id;
        _annualCost = annualCost;
    }
    
    public int getAnnualCost() {
        return _annualCost;
    }
    
    public String getId() {
        return _id;
    }
}

class DepartmentAfter extends Party {
    private String _staff;
    private int _annualCost;
    
    public DepartmentAfter(String name, String staff, int annualCost) {
        super(name);
        _staff = staff;
        _annualCost = annualCost;
    }
    
    public int getAnnualCost() {
        return _annualCost;
    }
    
    public String getStaff() {
        return _staff;
    }
}

