package com.refactoring.chapter7.movingfeatures.extractclass;

/**
 * Extract Class - BEFORE Refactoring
 * 
 * The Person class has too many responsibilities. It handles both person data
 * and telephone number data. The telephone-related fields and methods should be
 * extracted into a separate TelephoneNumber class.
 * 
 * HOW TO RECOGNIZE YOU NEED THIS REFACTORING:
 * 
 * 1. CLASS HAS MULTIPLE RESPONSIBILITIES
 *    - Person handles: person data AND telephone data (the "AND" is a red flag)
 * 
 * 2. FIELDS ARE ALWAYS USED TOGETHER
 *    - _officeAreaCode and _officeNumber are always used together
 *    - They form a logical group (telephone number)
 * 
 * 3. METHODS ONLY USE A SUBSET OF FIELDS
 *    - getTelephoneNumber() only uses telephone fields, not _name
 *    - This suggests those fields belong in their own class
 * 
 * 4. YOU CAN DESCRIBE THE CLASS WITH "AND"
 *    - "This class handles person data AND telephone data"
 *    - Multiple responsibilities = candidate for extraction
 * 
 * WHEN TO DO THIS REFACTORING:
 * - When adding features would make the class bigger
 * - When the class is hard to understand
 * - When you want to reuse part of the class
 * - When you have tests in place (safety net)
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

