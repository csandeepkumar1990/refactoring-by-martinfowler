package com.refactoring.chapter7.movingfeatures.introducelocalextension;

import java.util.Date;

/**
 * Introduce Local Extension - Example: Wrapper
 * 
 * When you need several foreign methods, it's better to create a
 * local extension. This example shows using a wrapper approach.
 * 
 * Wrapper approach: Use composition when you can't subclass (e.g., Date is final)
 */
public class MyDateWrapper {
    private Date _original;
    
    public MyDateWrapper(Date date) {
        _original = date;
    }
    
    public MyDateWrapper(int year, int month, int date) {
        _original = new Date(year, month, date);
    }
    
    // Delegate all Date methods
    public int getYear() {
        return _original.getYear();
    }
    
    public int getMonth() {
        return _original.getMonth();
    }
    
    public int getDate() {
        return _original.getDate();
    }
    
    // Add new functionality
    public MyDateWrapper nextDay() {
        return new MyDateWrapper(new Date(_original.getYear(), 
                                         _original.getMonth(), 
                                         _original.getDate() + 1));
    }
    
    public MyDateWrapper previousDay() {
        return new MyDateWrapper(new Date(_original.getYear(), 
                                          _original.getMonth(), 
                                          _original.getDate() - 1));
    }
    
    public Date toDate() {
        return _original;
    }
    
    public boolean equals(Object arg) {
        if (this == arg) return true;
        if (!(arg instanceof MyDateWrapper)) return false;
        MyDateWrapper other = (MyDateWrapper) arg;
        return _original.equals(other._original);
    }
}

