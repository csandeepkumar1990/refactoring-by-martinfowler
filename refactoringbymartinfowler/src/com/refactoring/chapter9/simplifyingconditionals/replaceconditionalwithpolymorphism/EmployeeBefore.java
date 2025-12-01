package com.refactoring.chapter9.simplifyingconditionals.replaceconditionalwithpolymorphism;

/**
 * Replace Conditional with Polymorphism - BEFORE Refactoring
 * 
 * The conditional logic uses type codes to determine behavior.
 * We should use polymorphism instead, moving the behavior into subclasses.
 */
public class EmployeeBefore {
    private EmployeeType type;
    
    double getType() {
        return type.getTypeCode();
    }
    
    double payAmount() {
        switch ((int)type.getTypeCode()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
    
    private double _monthlySalary;
    private double _commission;
    private double _bonus;
}

class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
    int getTypeCode() {
        return 0;
    }
}

