package com.refactoring.chapter7.movingfeatures.hidedelegate;

/**
 * Hide Delegate - BEFORE Refactoring
 * 
 * The client code needs to know about the Department class to get a person's manager.
 * This creates coupling - if the Department structure changes, all clients must change.
 * We should hide this delegation by adding a method to Person that handles it.
 */
public class PersonBefore {
    private Department _department;
    
    public PersonBefore(Department department) {
        this._department = department;
    }
    
    public Department getDepartment() {
        return _department;
    }
    
    public void setDepartment(Department arg) {
        _department = arg;
    }
}


