package com.refactoring.chapter8.organizingdata.replacetypecodewithsubclasses;

/**
 * Replace Type Code with Subclasses - AFTER Refactoring
 * 
 * The type code has been replaced with subclasses. Each subclass
 * can now have its own behavior, making the code more extensible.
 */
abstract class EmployeeAfter {
    abstract int getType();
    
    static EmployeeAfter create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }
    
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}

class Engineer extends EmployeeAfter {
    int getType() {
        return EmployeeAfter.ENGINEER;
    }
}

class Salesman extends EmployeeAfter {
    int getType() {
        return EmployeeAfter.SALESMAN;
    }
}

class Manager extends EmployeeAfter {
    int getType() {
        return EmployeeAfter.MANAGER;
    }
}

