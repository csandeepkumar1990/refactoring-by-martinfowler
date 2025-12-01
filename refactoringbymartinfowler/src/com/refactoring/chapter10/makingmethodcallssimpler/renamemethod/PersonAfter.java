package com.refactoring.chapter10.makingmethodcallssimpler.renamemethod;

/**
 * Rename Method - AFTER Refactoring
 * 
 * The method has been renamed to getOfficeTelephoneNumber() which
 * clearly indicates it returns the office telephone number.
 */
public class PersonAfter {
    private String _officeAreaCode;
    private String _officeNumber;
    
    public String getOfficeTelephoneNumber() {
        return "(" + _officeAreaCode + ") " + _officeNumber;
    }
}

