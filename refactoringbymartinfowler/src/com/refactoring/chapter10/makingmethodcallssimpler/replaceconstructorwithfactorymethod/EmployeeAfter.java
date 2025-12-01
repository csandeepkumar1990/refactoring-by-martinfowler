package com.refactoring.chapter10.makingmethodcallssimpler.replaceconstructorwithfactorymethod;

/**
 * Replace Constructor with Factory Method - AFTER Refactoring
 * 
 * The constructor has been replaced with factory methods that have
 * descriptive names, making the code more self-documenting.
 */
public class EmployeeAfter {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    
    private EmployeeAfter(int type) {
        _type = type;
    }
    
    static EmployeeAfter createEngineer() {
        return new EmployeeAfter(ENGINEER);
    }
    
    static EmployeeAfter createSalesman() {
        return new EmployeeAfter(SALESMAN);
    }
}

