package com.refactoring.chapter11.dealingwithgeneralization.extractsuperclass;

/**
 * Extract Superclass - BEFORE Refactoring
 * 
 * Employee and Department have duplicated code (name, annualCost).
 * We should extract a common superclass to eliminate duplication.
 */
class EmployeeBefore {
    private String _name;
    private String _id;
    private int _annualCost;
    
    public EmployeeBefore(String name, String id, int annualCost) {
        _name = name;
        _id = id;
        _annualCost = annualCost;
    }
    
    public String getName() {
        return _name;
    }
    
    public int getAnnualCost() {
        return _annualCost;
    }
    
    public String getId() {
        return _id;
    }
}

class DepartmentBefore {
    private String _name;
    private String _staff;
    private int _annualCost;
    
    public DepartmentBefore(String name, String staff, int annualCost) {
        _name = name;
        _staff = staff;
        _annualCost = annualCost;
    }
    
    public String getName() {
        return _name;
    }
    
    public int getAnnualCost() {
        return _annualCost;
    }
    
    public String getStaff() {
        return _staff;
    }
}

