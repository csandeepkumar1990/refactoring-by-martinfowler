package com.refactoring.chapter11.dealingwithgeneralization.extractsuperclass;

/**
 * Supporting Party superclass for Extract Superclass example
 */
abstract class Party {
    protected String _name;
    
    public Party(String name) {
        _name = name;
    }
    
    public String getName() {
        return _name;
    }
    
    abstract int getAnnualCost();
}

