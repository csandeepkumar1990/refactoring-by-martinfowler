package com.refactoring.chapter10.makingmethodcallssimpler.replaceconstructorwithfactorymethod;

/**
 * Replace Constructor with Factory Method - BEFORE Refactoring
 * 
 * The constructor is used to create different types of employees.
 * We should use factory methods with descriptive names instead.
 */
public class EmployeeBefore {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    
    EmployeeBefore(int type) {
        _type = type;
    }
}

