package com.refactoring.chapter7.movingfeatures.extractclass;

/**
 * Extract Class - BEFORE Refactoring
 * 
 * The Person class has too many responsibilities. It handles both person data
 * and telephone number data. The telephone-related fields and methods should be
 * extracted into a separate TelephoneNumber class.
 */
public class PersonBefore {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;
    
    public PersonBefore(String name, String officeAreaCode, String officeNumber) {
        this._name = name;
        this._officeAreaCode = officeAreaCode;
        this._officeNumber = officeNumber;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getTelephoneNumber() {
        return "(" + _officeAreaCode + ") " + _officeNumber;
    }
    
    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }
    
    public void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }
    
    public String getOfficeNumber() {
        return _officeNumber;
    }
    
    public void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}

