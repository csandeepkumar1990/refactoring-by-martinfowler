package com.refactoring.chapter7.movingfeatures.introducelocalextension;

import java.util.Date;

/**
 * Introduce Local Extension - Example: Subclass
 * 
 * When you need several foreign methods, it's better to create a
 * local extension. This example shows using a subclass approach.
 * 
 * Subclass approach: Extend the class if possible (but Date is final in Java)
 */
public class MyDateSubclass extends Date {
    public MyDateSubclass(int year, int month, int date) {
        super(year, month, date);
    }
    
    public MyDateSubclass(Date date) {
        super(date.getYear(), date.getMonth(), date.getDate());
    }
    
    Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
    
    Date previousDay() {
        return new Date(getYear(), getMonth(), getDate() - 1);
    }
}

