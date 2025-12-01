package com.refactoring.chapter6.composingmethods.removeassignmentstoparameters;

/**
 * Remove Assignments to Parameters - BEFORE Refactoring
 * 
 * The code assigns to the inputVal parameter multiple times.
 * This is confusing and can lead to bugs. We should use a temporary variable instead.
 */
public class DiscountCalculatorBefore {
    int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}

