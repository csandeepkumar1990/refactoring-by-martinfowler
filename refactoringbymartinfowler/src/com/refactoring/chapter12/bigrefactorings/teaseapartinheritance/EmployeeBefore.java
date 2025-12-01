package com.refactoring.chapter12.bigrefactorings.teaseapartinheritance;

/**
 * Tease Apart Inheritance - BEFORE Refactoring
 * 
 * A class hierarchy is doing two jobs at once. The Employee hierarchy
 * mixes both employee type (Engineer, Salesman) and employee status
 * (Active, Retired). This creates a combinatorial explosion of subclasses.
 * 
 * PROBLEM: Two independent variations are mixed in one hierarchy
 */
abstract class EmployeeBefore {
    abstract double getType();
    abstract String getStatus();
}

class ActiveEngineer extends EmployeeBefore {
    double getType() { return 1; }
    String getStatus() { return "Active"; }
}

class RetiredEngineer extends EmployeeBefore {
    double getType() { return 1; }
    String getStatus() { return "Retired"; }
}

class ActiveSalesman extends EmployeeBefore {
    double getType() { return 2; }
    String getStatus() { return "Active"; }
}

class RetiredSalesman extends EmployeeBefore {
    double getType() { return 2; }
    String getStatus() { return "Retired"; }
}

