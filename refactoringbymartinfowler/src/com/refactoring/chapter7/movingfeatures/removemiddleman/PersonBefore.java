package com.refactoring.chapter7.movingfeatures.removemiddleman;

/**
 * Remove Middle Man - BEFORE Refactoring
 * 
 * Person has too many delegating methods. Every method in Department
 * seems to have a corresponding method in Person. Person is becoming
 * a middle man that doesn't add value. We should remove it and let
 * clients access Department directly.
 */
public class PersonBefore {
    private Department _department;
    
    public PersonBefore(Department department) {
        this._department = department;
    }
    
    public PersonBefore getManager() {
        return _department.getManager();
    }
    
    public String getDepartmentName() {
        return _department.getName();
    }
    
    public String getDepartmentCode() {
        return _department.getCode();
    }
    
    // Too many delegating methods - Person is just a middle man
}

