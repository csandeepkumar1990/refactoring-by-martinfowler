package com.refactoring.chapter11.dealingwithgeneralization.replaceinheritancewithdelegation;

import java.util.Vector;

/**
 * Replace Inheritance with Delegation - BEFORE Refactoring
 * 
 * MyStack inherits from Vector, but it only uses a small subset of Vector's
 * interface. This creates unnecessary coupling. We should use delegation instead.
 */
class MyStackBefore extends Vector {
    public void push(Object element) {
        insertElementAt(element, 0);
    }
    
    public Object pop() {
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}

