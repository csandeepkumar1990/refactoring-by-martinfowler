package com.refactoring.chapter7.movingfeatures.inlineclass;

/**
 * Inline Class - BEFORE Refactoring
 * 
 * The Person class has a TelephoneNumber class that doesn't do enough to
 * justify its existence. It's just a simple data holder. We should inline
 * it back into Person.
 */
public class PersonBefore {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();
    
    public PersonBefore(String name, String officeAreaCode, String officeNumber) {
        this._name = name;
        _officeTelephone.setAreaCode(officeAreaCode);
        _officeTelephone.setNumber(officeNumber);
    }
    
    public String getName() {
        return _name;
    }
    
    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }
    
    public TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }
}

/**
 * This class doesn't do enough to justify its existence.
 * It should be inlined back into Person.
 */
class TelephoneNumber {
    private String _areaCode;
    private String _number;
    
    public String getAreaCode() {
        return _areaCode;
    }
    
    public void setAreaCode(String arg) {
        _areaCode = arg;
    }
    
    public String getNumber() {
        return _number;
    }
    
    public void setNumber(String arg) {
        _number = arg;
    }
    
    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }
}

