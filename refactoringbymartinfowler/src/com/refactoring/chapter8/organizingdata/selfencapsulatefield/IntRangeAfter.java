package com.refactoring.chapter8.organizingdata.selfencapsulatefield;

/**
 * Self Encapsulate Field - AFTER Refactoring
 * 
 * The fields are now accessed through getter methods. This allows
 * subclasses to override the access behavior if needed.
 */
public class IntRangeAfter {
    private int _low, _high;
    
    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }
    
    void grow(int factor) {
        setHigh(getHigh() * factor);
    }
    
    public IntRangeAfter(int low, int high) {
        _low = low;
        _high = high;
    }
    
    int getLow() {
        return _low;
    }
    
    int getHigh() {
        return _high;
    }
    
    void setLow(int arg) {
        _low = arg;
    }
    
    void setHigh(int arg) {
        _high = arg;
    }
}

