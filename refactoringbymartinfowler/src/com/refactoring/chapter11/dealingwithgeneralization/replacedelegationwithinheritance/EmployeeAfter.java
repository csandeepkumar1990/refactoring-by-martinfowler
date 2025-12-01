package com.refactoring.chapter11.dealingwithgeneralization.replacedelegationwithinheritance;

/**
 * Replace Delegation with Inheritance - AFTER Refactoring
 * 
 * Employee now inherits from Person instead of delegating to it.
 * This is appropriate when Employee needs all of Person's behavior
 * and doesn't need to hide Person's interface.
 */
class EmployeeAfter extends Person {
    public String toString() {
        return "Emp: " + getName();
    }
}

