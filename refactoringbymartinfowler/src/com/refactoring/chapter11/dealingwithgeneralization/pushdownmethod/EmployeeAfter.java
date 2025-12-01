package com.refactoring.chapter11.dealingwithgeneralization.pushdownmethod;

/**
 * Push Down Method - AFTER Refactoring
 * 
 * The getQuota() method has been pushed down to Salesman where it's actually used.
 * This makes the Employee class simpler and more focused.
 */
abstract class EmployeeAfter {
    protected String _name;
}

class SalesmanAfter extends EmployeeAfter {
    int getQuota() {
        return 100;
    }
}

class EngineerAfter extends EmployeeAfter {
    // doesn't need getQuota()
}

