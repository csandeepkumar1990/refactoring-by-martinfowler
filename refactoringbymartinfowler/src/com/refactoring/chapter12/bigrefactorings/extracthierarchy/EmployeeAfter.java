package com.refactoring.chapter12.bigrefactorings.extracthierarchy;

/**
 * Extract Hierarchy - AFTER Refactoring
 * 
 * The conditional logic has been replaced with a class hierarchy.
 * Each employee type is now a separate class with its own behavior.
 * This eliminates conditionals and makes it easy to add new types.
 */
abstract class EmployeeAfter {
    protected double salary;
    
    abstract double calculatePay();
    abstract String getDescription();
}

class Engineer extends EmployeeAfter {
    public Engineer(double salary) {
        this.salary = salary;
    }
    
    double calculatePay() {
        return salary;
    }
    
    String getDescription() {
        return "Technical professional";
    }
}

class Salesman extends EmployeeAfter {
    private double commission;
    
    public Salesman(double salary, double commission) {
        this.salary = salary;
        this.commission = commission;
    }
    
    double calculatePay() {
        return salary + commission;
    }
    
    String getDescription() {
        return "Sales professional";
    }
}

class Manager extends EmployeeAfter {
    private double bonus;
    
    public Manager(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    
    double calculatePay() {
        return salary + bonus;
    }
    
    String getDescription() {
        return "Management professional";
    }
}

