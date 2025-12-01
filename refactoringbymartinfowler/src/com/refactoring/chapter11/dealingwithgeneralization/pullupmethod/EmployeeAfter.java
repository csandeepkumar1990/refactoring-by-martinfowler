package com.refactoring.chapter11.dealingwithgeneralization.pullupmethod;

/**
 * Pull Up Method - AFTER Refactoring
 * 
 * The getName() method has been pulled up to the Employee superclass,
 * eliminating duplication and making the code more maintainable.
 */
abstract class EmployeeAfter {
    protected String _name;
    
    public String getName() {
        return _name;
    }
}

class SalesmanAfter extends EmployeeAfter {
    // getName() is now inherited from Employee
}

class EngineerAfter extends EmployeeAfter {
    // getName() is now inherited from Employee
}

