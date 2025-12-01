package com.refactoring.chapter12.bigrefactorings.teaseapartinheritance;

/**
 * Tease Apart Inheritance - AFTER Refactoring
 * 
 * The two independent variations have been separated into two hierarchies:
 * - EmployeeType hierarchy (Engineer, Salesman)
 * - EmployeeStatus hierarchy (Active, Retired)
 * 
 * Employee now uses composition to combine type and status, eliminating
 * the combinatorial explosion of subclasses.
 */
class EmployeeAfter {
    private EmployeeType _type;
    private EmployeeStatus _status;
    
    public EmployeeAfter(EmployeeType type, EmployeeStatus status) {
        _type = type;
        _status = status;
    }
    
    double getType() {
        return _type.getTypeCode();
    }
    
    String getStatus() {
        return _status.getStatus();
    }
}

abstract class EmployeeType {
    abstract double getTypeCode();
}

class Engineer extends EmployeeType {
    double getTypeCode() { return 1; }
}

class Salesman extends EmployeeType {
    double getTypeCode() { return 2; }
}

abstract class EmployeeStatus {
    abstract String getStatus();
}

class Active extends EmployeeStatus {
    String getStatus() { return "Active"; }
}

class Retired extends EmployeeStatus {
    String getStatus() { return "Retired"; }
}

