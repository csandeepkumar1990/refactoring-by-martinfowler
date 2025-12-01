package com.refactoring.chapter8.organizingdata.replacetypecodewithclass;

/**
 * Replace Type Code with Class - BEFORE Refactoring
 * 
 * The _bloodGroup field is an int type code. Type codes are error-prone
 * and don't provide type safety. We should replace it with a BloodGroup class.
 */
public class PersonBefore {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;
    
    private int _bloodGroup;
    
    public PersonBefore(int bloodGroup) {
        _bloodGroup = bloodGroup;
    }
    
    public void setBloodGroup(int arg) {
        _bloodGroup = arg;
    }
    
    public int getBloodGroup() {
        return _bloodGroup;
    }
}

