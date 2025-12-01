package com.refactoring.chapter7.movingfeatures.extractclass;

/**
 * Extract Class - AFTER Refactoring
 * 
 * The telephone-related fields and methods have been extracted into a
 * separate TelephoneNumber class. Person now delegates telephone operations
 * to this new class, making the code more cohesive.
 * 
 * BENEFITS OF THIS REFACTORING:
 * 
 * 1. SINGLE RESPONSIBILITY
 *    - Person now only handles person data
 *    - TelephoneNumber handles telephone data
 *    - Each class has one clear purpose
 * 
 * 2. BETTER COHESION
 *    - Related data and behavior are together
 *    - Telephone fields and methods are in TelephoneNumber
 * 
 * 3. EASIER TO UNDERSTAND
 *    - Clear separation of concerns
 *    - Easier to find telephone-related code
 * 
 * 4. MORE REUSABLE
 *    - TelephoneNumber can be used by other classes
 *    - Not tied to Person anymore
 * 
 * 5. EASIER TO TEST
 *    - Can test telephone logic independently
 *    - Can test person logic independently
 */
public class PersonAfter {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();
    
    public PersonAfter(String name, String officeAreaCode, String officeNumber) {
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
 * New class extracted from Person to handle telephone number responsibilities.
 * This makes the code more cohesive - each class has a single, clear responsibility.
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

