package com.refactoring.chapter11.dealingwithgeneralization.pullupmethod;

/**
 * Pull Up Method - BEFORE Refactoring
 * 
 * The getName() method is duplicated in both Salesman and Engineer.
 * We should pull it up to the Employee superclass.
 */
class Salesman {
    private String _name;
    
    public String getName() {
        return _name;
    }
}

class Engineer {
    private String _name;
    
    public String getName() {
        return _name;
    }
}

