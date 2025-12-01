package com.refactoring.chapter11.dealingwithgeneralization.replaceinheritancewithdelegation;

import java.util.Vector;

/**
 * Replace Inheritance with Delegation - AFTER Refactoring
 * 
 * MyStack now uses delegation instead of inheritance. It has a Vector field
 * and delegates operations to it. This reduces coupling and makes the
 * interface clearer.
 */
class MyStackAfter {
    private Vector _vector = new Vector();
    
    public void push(Object element) {
        _vector.insertElementAt(element, 0);
    }
    
    public Object pop() {
        Object result = _vector.firstElement();
        _vector.removeElementAt(0);
        return result;
    }
    
    public int size() {
        return _vector.size();
    }
    
    public boolean isEmpty() {
        return _vector.isEmpty();
    }
}

