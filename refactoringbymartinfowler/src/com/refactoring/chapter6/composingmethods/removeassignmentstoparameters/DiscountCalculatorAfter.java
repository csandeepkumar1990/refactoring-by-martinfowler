package com.refactoring.chapter6.composingmethods.removeassignmentstoparameters;

/**
 * Remove Assignments to Parameters - AFTER Refactoring
 * 
 * The parameter assignments have been replaced with a temporary variable.
 * This makes it clear that we're modifying a local value, not the parameter itself.
 * The parameters can now be marked as final to enforce this convention.
 */
public class DiscountCalculatorAfter {
    int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }
}

