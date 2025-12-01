package com.refactoring.chapter7.movingfeatures.introduceforeignmethod;

import java.util.Date;

/**
 * Introduce Foreign Method - AFTER Refactoring
 * 
 * We've introduced a foreign method nextDay() that adds the missing
 * functionality to Date. This makes the code more readable and reusable.
 * Since we can't modify the Date class (it's a library class), this is
 * the best approach.
 */
public class ReportAfter {
    private Date previousEnd;
    
    public ReportAfter(Date previousEnd) {
        this.previousEnd = previousEnd;
    }
    
    void sendReport() {
        Date nextDay = nextDay(previousEnd);
        // send report logic...
    }
    
    /**
     * Foreign method: adds functionality to Date class that we can't modify.
     * This method would ideally be in Date, but since it's a library class,
     * we add it here as a foreign method.
     */
    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}

