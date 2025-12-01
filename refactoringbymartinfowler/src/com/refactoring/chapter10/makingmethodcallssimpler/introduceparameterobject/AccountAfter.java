package com.refactoring.chapter10.makingmethodcallssimpler.introduceparameterobject;

/**
 * Introduce Parameter Object - AFTER Refactoring
 * 
 * The related parameters have been grouped into a DateRange object.
 * This makes the method signature clearer and allows for behavior
 * to be added to the parameter object.
 */
public class AccountAfter {
    double getFlowBetween(DateRange range) {
        // calculate flow between start and end dates
        return 100.0;
    }
}

