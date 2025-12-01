package com.refactoring.chapter10.makingmethodcallssimpler.removeparameter;

/**
 * Remove Parameter - BEFORE Refactoring
 * 
 * The method has a parameter that is no longer used.
 * We should remove it to simplify the method signature.
 */
public class PersonBefore {
    public String getContact(String name, String phone) {
        // phone parameter is not used
        return "Contact: " + name;
    }
}

