package com.refactoring.chapter7.movingfeatures.introduceforeignmethod;

import java.util.Date;

/**
 * Introduce Foreign Method - BEFORE Refactoring
 * 
 * We need to add a day to a date, but the Date class doesn't have
 * a method for this. Since we can't modify the Date class (it's a
 * library class), we introduce a foreign method in our client class.
 */
public class ReportBefore {
    private Date previousEnd;
    
    public ReportBefore(Date previousEnd) {
        this.previousEnd = previousEnd;
    }
    
    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(),
                               previousEnd.getMonth(),
                               previousEnd.getDate() + 1);
        // send report logic...
    }
}

