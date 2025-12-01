package com.refactoring.chapter8.organizingdata.replacesubclasswithfields;

/**
 * Replace Subclass with Fields - AFTER Refactoring
 * 
 * The subclasses have been removed. The parent class now uses fields
 * to represent the differences. This simplifies the hierarchy when
 * subclasses only differ by constant data.
 */
class PersonAfter {
    private final boolean _isMale;
    private final char _code;
    
    protected PersonAfter(boolean isMale, char code) {
        _isMale = isMale;
        _code = code;
    }
    
    static PersonAfter createMale() {
        return new PersonAfter(true, 'M');
    }
    
    static PersonAfter createFemale() {
        return new PersonAfter(false, 'F');
    }
    
    boolean isMale() {
        return _isMale;
    }
    
    char getCode() {
        return _code;
    }
}

