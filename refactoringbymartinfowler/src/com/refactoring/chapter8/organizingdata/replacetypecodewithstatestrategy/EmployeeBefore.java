package com.refactoring.chapter8.organizingdata.replacetypecodewithstatestrategy;

/**
 * Replace Type Code with State/Strategy - BEFORE Refactoring
 * 
 * The type code affects behavior, but we can't use subclasses (e.g., Employee
 * type changes during its lifetime). We should use the State or Strategy pattern.
 */
public class EmployeeBefore {
    private int _type;
    
    EmployeeBefore(int type) {
        _type = type;
    }
    
    int payAmount() {
        switch (_type) {
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
    
    private int _monthlySalary;
    private int _commission;
    private int _bonus;
    
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}

