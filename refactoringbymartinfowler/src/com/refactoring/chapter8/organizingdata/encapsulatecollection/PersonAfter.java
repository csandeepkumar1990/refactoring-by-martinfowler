package com.refactoring.chapter8.organizingdata.encapsulatecollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 * Encapsulate Collection - AFTER Refactoring
 * 
 * The collection is now properly encapsulated. Clients can't directly
 * modify the collection, and we provide methods to add/remove courses.
 * The getter returns an unmodifiable view of the collection.
 */
public class PersonAfter {
    private Vector<Course> _courses = new Vector<>();
    
    public void addCourse(Course arg) {
        _courses.add(arg);
    }
    
    public void removeCourse(Course arg) {
        _courses.remove(arg);
    }
    
    public Iterator<Course> getCourses() {
        return Collections.unmodifiableList(_courses).iterator();
    }
    
    public int numberOfCourses() {
        return _courses.size();
    }
    
    public int numberOfAdvancedCourses() {
        int count = 0;
        Iterator<Course> iter = getCourses();
        while (iter.hasNext()) {
            Course each = iter.next();
            if (each.isAdvanced()) count++;
        }
        return count;
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

