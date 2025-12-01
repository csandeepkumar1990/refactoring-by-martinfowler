package com.refactoring.chapter8.organizingdata.encapsulatecollection;

import java.util.Vector;

/**
 * Encapsulate Collection - BEFORE Refactoring
 * 
 * The _courses field is a collection that's accessed directly.
 * We should encapsulate it to prevent clients from modifying the
 * collection directly and to provide better control.
 */
public class PersonBefore {
    private Vector<Course> _courses = new Vector<>();
    
    public Vector<Course> getCourses() {
        return _courses;
    }
    
    public void setCourses(Vector<Course> arg) {
        _courses = arg;
    }
}

/**
 * Supporting Course class
 */
class Course {
    private String _name;
    private boolean _isAdvanced;
    
    public Course(String name, boolean isAdvanced) {
        _name = name;
        _isAdvanced = isAdvanced;
    }
    
    public boolean isAdvanced() {
        return _isAdvanced;
    }
}

