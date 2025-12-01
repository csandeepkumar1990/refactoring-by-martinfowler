package com.refactoring.chapter9.simplifyingconditionals.replacenestedconditionalwithguardclauses;

/**
 * Replace Nested Conditional with Guard Clauses - AFTER Refactoring
 * 
 * The nested conditionals have been replaced with guard clauses.
 * Each special case is handled early and returns immediately,
 * making the code much more readable.
 */
public class EmployeeAfter {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;
    
    double getPayAmount() {
        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmount();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
    }
    
    private double deadAmount() { return 0; }
    private double separatedAmount() { return 0; }
    private double retiredAmount() { return 0; }
    private double normalPayAmount() { return 100; }
}

