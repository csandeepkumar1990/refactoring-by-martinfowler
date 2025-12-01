package com.refactoring.chapter10.makingmethodcallssimpler.introduceparameterobject;

import java.util.Date;

/**
 * Introduce Parameter Object - BEFORE Refactoring
 * 
 * The method has multiple parameters that are related (start date and end date).
 * We should group them into a parameter object.
 */
public class AccountBefore {
    double getFlowBetween(Date start, Date end) {
        // calculate flow between start and end dates
        return 100.0;
    }
}

