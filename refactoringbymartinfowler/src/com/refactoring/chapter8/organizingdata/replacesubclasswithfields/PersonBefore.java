package com.refactoring.chapter8.organizingdata.replacesubclasswithfields;

/**
 * Replace Subclass with Fields - BEFORE Refactoring
 * 
 * The subclasses (Male and Female) only differ by constant methods.
 * They don't have enough behavior to justify separate classes.
 * We should replace them with fields in the parent class.
 */
abstract class PersonBefore {
    abstract boolean isMale();
    abstract char getCode();
}

class Male extends PersonBefore {
    boolean isMale() {
        return true;
    }
    
    char getCode() {
        return 'M';
    }
}

class Female extends PersonBefore {
    boolean isMale() {
        return false;
    }
    
    char getCode() {
        return 'F';
    }
}

