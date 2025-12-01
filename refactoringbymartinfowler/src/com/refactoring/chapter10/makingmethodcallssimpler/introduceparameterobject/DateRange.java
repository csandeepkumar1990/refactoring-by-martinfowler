package com.refactoring.chapter10.makingmethodcallssimpler.introduceparameterobject;

import java.util.Date;

/**
 * Supporting DateRange class for Introduce Parameter Object example
 */
public class DateRange {
    private final Date _start;
    private final Date _end;
    
    public DateRange(Date start, Date end) {
        _start = start;
        _end = end;
    }
    
    public Date getStart() {
        return _start;
    }
    
    public Date getEnd() {
        return _end;
    }
    
    public boolean includes(Date date) {
        return date.equals(_start) || date.equals(_end) ||
               (date.after(_start) && date.before(_end));
    }
}

