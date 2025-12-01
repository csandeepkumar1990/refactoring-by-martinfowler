package com.refactoring.chapter8.organizingdata.changereferencetovalue;

/**
 * Supporting Currency class for Change Reference to Value example
 * 
 * Currency should be a value object - two Currency objects with the same
 * code should be considered equal, and we don't need shared instances.
 */
public class Currency {
    private String _code;
    
    public Currency(String code) {
        _code = code;
    }
    
    public String getCode() {
        return _code;
    }
    
    public boolean equals(Object arg) {
        if (!(arg instanceof Currency)) return false;
        Currency other = (Currency) arg;
        return _code.equals(other._code);
    }
    
    public int hashCode() {
        return _code.hashCode();
    }
}

