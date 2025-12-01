package com.refactoring.chapter9.simplifyingconditionals.replacenestedconditionalwithguardclauses;

/**
 * Replace Nested Conditional with Guard Clauses - BEFORE Refactoring
 * 
 * The nested conditionals make the code hard to read. We should use
 * guard clauses to handle special cases early and return immediately.
 */
public class EmployeeBefore {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;
    
    double getPayAmount() {
        double result;
        if (isDead) {
            result = deadAmount();
        } else {
            if (isSeparated) {
                result = separatedAmount();
            } else {
                if (isRetired) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }
    
    private double deadAmount() { return 0; }
    private double separatedAmount() { return 0; }
    private double retiredAmount() { return 0; }
    private double normalPayAmount() { return 100; }
}

