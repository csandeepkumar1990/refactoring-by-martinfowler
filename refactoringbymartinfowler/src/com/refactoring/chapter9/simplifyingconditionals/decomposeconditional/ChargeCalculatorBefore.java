package com.refactoring.chapter9.simplifyingconditionals.decomposeconditional;

import java.util.Date;

/**
 * Decompose Conditional - BEFORE Refactoring
 * 
 * The conditional logic is complex and hard to understand.
 * We should extract the condition and branches into well-named methods.
 */
public class ChargeCalculatorBefore {
    private Date date;
    private int quantity;
    private double charge;
    private static final Date SUMMER_START = new Date(2024, 5, 1);
    private static final Date SUMMER_END = new Date(2024, 8, 1);
    private static final double WINTER_RATE = 0.8;
    private static final double WINTER_SERVICE_CHARGE = 10.0;
    private static final double SUMMER_RATE = 0.6;
    
    double calculateCharge() {
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * WINTER_RATE + WINTER_SERVICE_CHARGE;
        } else {
            charge = quantity * SUMMER_RATE;
        }
        return charge;
    }
}

