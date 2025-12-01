package com.refactoring.chapter7.movingfeatures.inlineclass;

/**
 * Inline Class - AFTER Refactoring
 * 
 * The TelephoneNumber class has been inlined back into Person.
 * Since TelephoneNumber was just a simple data holder without much behavior,
 * it didn't justify its own class. The fields and methods are now directly in Person.
 */
public class PersonAfter {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;
    
    public PersonAfter(String name, String officeAreaCode, String officeNumber) {
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

