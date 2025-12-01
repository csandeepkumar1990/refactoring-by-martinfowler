package com.refactoring.chapter10.makingmethodcallssimpler.renamemethod;

/**
 * Rename Method - BEFORE Refactoring
 * 
 * The method name getTelephoneNumber() doesn't clearly indicate
 * what it returns. We should rename it to be more descriptive.
 */
public class PersonBefore {
    private String _officeAreaCode;
    private String _officeNumber;
    
    public String getTelephoneNumber() {
        return "(" + _officeAreaCode + ") " + _officeNumber;
    }
}

