package com.refactoring.chapter9.simplifyingconditionals.decomposeconditional;

import java.util.Date;

/**
 * Decompose Conditional - AFTER Refactoring
 * 
 * The conditional has been decomposed into well-named methods.
 * This makes the code much more readable and self-documenting.
 */
public class ChargeCalculatorAfter {
    private Date date;
    private int quantity;
    private double charge;
    private static final Date SUMMER_START = new Date(2024, 5, 1);
    private static final Date SUMMER_END = new Date(2024, 8, 1);
    private static final double WINTER_RATE = 0.8;
    private static final double WINTER_SERVICE_CHARGE = 10.0;
    private static final double SUMMER_RATE = 0.6;
    
    double calculateCharge() {
        if (notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
        return charge;
    }
    
    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
    
    private double summerCharge(int quantity) {
        return quantity * SUMMER_RATE;
    }
    
    private double winterCharge(int quantity) {
        return quantity * WINTER_RATE + WINTER_SERVICE_CHARGE;
    }
}

