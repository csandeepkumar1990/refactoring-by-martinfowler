package com.refactoring.chapter7.movingfeatures.hidedelegate;

/**
 * Hide Delegate - AFTER Refactoring
 * 
 * The Person class now hides the Department delegate by providing a
 * getManager() method directly. Clients no longer need to know about
 * the Department class structure.
 */
public class PersonAfter {
    private Department _department;
    
    public PersonAfter(Department department) {
        this._department = department;
    }
    
    public PersonBefore getManager() {
        return _department.getManager();
    }
    
    public void setDepartment(Department arg) {
        _department = arg;
    }
}


