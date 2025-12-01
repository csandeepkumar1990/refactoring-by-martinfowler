package com.refactoring.chapter9.simplifyingconditionals.replaceconditionalwithpolymorphism;

/**
 * Replace Conditional with Polymorphism - AFTER Refactoring
 * 
 * The conditional has been replaced with polymorphism. Each employee
 * type is now a subclass with its own payAmount() implementation.
 */
abstract class EmployeeAfter {
    abstract double payAmount();
    
    static EmployeeAfter create(int type) {
        switch (type) {
            case EmployeeType.ENGINEER:
                return new Engineer();
            case EmployeeType.SALESMAN:
                return new Salesman();
            case EmployeeType.MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}

class Engineer extends EmployeeAfter {
    private double _monthlySalary = 5000;
    
    double payAmount() {
        return _monthlySalary;
    }
}

class Salesman extends EmployeeAfter {
    private double _monthlySalary = 4000;
    private double _commission = 1000;
    
    double payAmount() {
        return _monthlySalary + _commission;
    }
}

class Manager extends EmployeeAfter {
    private double _monthlySalary = 6000;
    private double _bonus = 2000;
    
    double payAmount() {
        return _monthlySalary + _bonus;
    }
}


