package com.refactoring.chapter9.simplifyingconditionals.consolidateconditionalexpression;

/**
 * Consolidate Conditional Expression - BEFORE Refactoring
 * 
 * Multiple conditionals return the same result. We should consolidate
 * them into a single conditional expression with a well-named method.
 */
public class EmployeeBefore {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;
    
    double disabilityAmount() {
        if (seniority < 2) return 0;
        if (monthsDisabled > 12) return 0;
        if (isPartTime) return 0;
        // compute disability amount
        return 100.0;
    }
}

