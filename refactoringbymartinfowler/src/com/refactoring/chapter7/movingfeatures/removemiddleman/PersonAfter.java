package com.refactoring.chapter7.movingfeatures.removemiddleman;

/**
 * Remove Middle Man - AFTER Refactoring
 * 
 * The middle man methods have been removed. Clients now access
 * Department directly through Person's getDepartment() method.
 * This removes unnecessary indirection.
 */
public class PersonAfter {
    private Department _department;
    
    public PersonAfter(Department department) {
        this._department = department;
    }
    
    public Department getDepartment() {
        return _department;
    }
    
    public void setDepartment(Department arg) {
        _department = arg;
    }
}

/**
 * Clients now access Department directly:
 * person.getDepartment().getManager()
 * person.getDepartment().getName()
 * This removes the unnecessary middle man layer.
 */

