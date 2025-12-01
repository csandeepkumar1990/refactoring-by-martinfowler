package com.refactoring.chapter9.simplifyingconditionals.consolidateconditionalexpression;

/**
 * Consolidate Conditional Expression - AFTER Refactoring
 * 
 * The multiple conditionals have been consolidated into a single
 * expression with a well-named method that explains the intent.
 */
public class EmployeeAfter {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;
    
    double disabilityAmount() {
        if (isNotEligibleForDisability()) return 0;
        // compute disability amount
        return 100.0;
    }
    
    private boolean isNotEligibleForDisability() {
        return seniority < 2 || monthsDisabled > 12 || isPartTime;
    }
}

