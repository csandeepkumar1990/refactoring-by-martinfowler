package com.refactoring.chapter10.makingmethodcallssimpler.addparameter;

/**
 * Add Parameter - BEFORE Refactoring
 * 
 * The method needs additional information (date) to perform its work.
 * We should add a parameter to pass this information.
 */
public class ContactBefore {
    public void getContact() {
        // needs date but doesn't have it
    }
}

