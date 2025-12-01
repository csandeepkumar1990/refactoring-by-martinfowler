package com.refactoring.chapter8.organizingdata.selfencapsulatefield;

/**
 * Self Encapsulate Field - BEFORE Refactoring
 * 
 * The _low and _high fields are accessed directly within the class.
 * We should encapsulate them with getter methods to allow for future
 * flexibility (e.g., subclasses can override behavior).
 */
public class IntRangeBefore {
    private int _low, _high;
    
    boolean includes(int arg) {
        return arg >= _low && arg <= _high;
    }
    
    void grow(int factor) {
        _high = _high * factor;
    }
    
    public IntRangeBefore(int low, int high) {
        _low = low;
        _high = high;
    }
}

