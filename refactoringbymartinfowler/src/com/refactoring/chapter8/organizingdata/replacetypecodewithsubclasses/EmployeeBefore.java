package com.refactoring.chapter8.organizingdata.replacetypecodewithsubclasses;

/**
 * Replace Type Code with Subclasses - BEFORE Refactoring
 * 
 * The _type field is used to determine behavior. We should replace
 * it with subclasses that encapsulate the type-specific behavior.
 */
public class EmployeeBefore {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
    EmployeeBefore(int type) {
        _type = type;
    }
    
    int getType() {
        return _type;
    }
}

