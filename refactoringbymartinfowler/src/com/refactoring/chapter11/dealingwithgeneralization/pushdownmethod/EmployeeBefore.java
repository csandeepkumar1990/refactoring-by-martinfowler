package com.refactoring.chapter11.dealingwithgeneralization.pushdownmethod;

/**
 * Push Down Method - BEFORE Refactoring
 * 
 * The getQuota() method in Employee is only used by Salesman.
 * It should be pushed down to the Salesman subclass.
 */
abstract class EmployeeBefore {
    protected String _name;
    
    int getQuota() {
        return 100;
    }
}

class SalesmanBefore extends EmployeeBefore {
    // uses getQuota()
}

class EngineerBefore extends EmployeeBefore {
    // doesn't use getQuota()
}

