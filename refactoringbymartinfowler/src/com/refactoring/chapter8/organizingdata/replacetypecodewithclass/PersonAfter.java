package com.refactoring.chapter8.organizingdata.replacetypecodewithclass;

/**
 * Replace Type Code with Class - AFTER Refactoring
 * 
 * The int type code has been replaced with a BloodGroup class.
 * This provides type safety and makes the code more self-documenting.
 */
public class PersonAfter {
    private BloodGroup _bloodGroup;
    
    public PersonAfter(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }
    
    public void setBloodGroup(BloodGroup arg) {
        _bloodGroup = arg;
    }
    
    public BloodGroup getBloodGroup() {
        return _bloodGroup;
    }
}

