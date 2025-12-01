package com.refactoring.chapter8.organizingdata.replacetypecodewithstatestrategy;

/**
 * Replace Type Code with State/Strategy - AFTER Refactoring
 * 
 * The type code has been replaced with a Strategy pattern. The Employee
 * delegates pay calculation to an EmployeeType object, allowing the type
 * to change during the employee's lifetime.
 */
public class EmployeeAfter {
    private EmployeeType _type;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;
    
    EmployeeAfter(int type) {
        setType(type);
    }
    
    int getType() {
        return _type.getTypeCode();
    }
    
    void setType(int arg) {
        _type = EmployeeType.newType(arg);
    }
    
    int payAmount() {
        return _type.payAmount(this);
    }
    
    int getMonthlySalary() {
        return _monthlySalary;
    }
    
    int getCommission() {
        return _commission;
    }
    
    int getBonus() {
        return _bonus;
    }
}

abstract class EmployeeType {
    abstract int getTypeCode();
    abstract int payAmount(EmployeeAfter employee);
    
    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }
    
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}

class Engineer extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
    
    int payAmount(EmployeeAfter employee) {
        return employee.getMonthlySalary();
    }
}

class Salesman extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
    
    int payAmount(EmployeeAfter employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }
}

class Manager extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
    
    int payAmount(EmployeeAfter employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}

