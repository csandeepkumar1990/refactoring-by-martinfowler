package com.refactoring.chapter10.makingmethodcallssimpler.removeparameter;

/**
 * Remove Parameter - AFTER Refactoring
 * 
 * The unused parameter has been removed, simplifying the method signature.
 */
public class PersonAfter {
    public String getContact(String name) {
        return "Contact: " + name;
    }
}

