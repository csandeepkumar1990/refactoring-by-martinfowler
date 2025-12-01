package com.refactoring.chapter11.dealingwithgeneralization.replacedelegationwithinheritance;

/**
 * Replace Delegation with Inheritance - BEFORE Refactoring
 * 
 * Employee delegates all its work to Person. If Employee needs all of Person's
 * behavior, we should use inheritance instead of delegation.
 */
class Person {
    private String _name;
    
    public String getName() {
        return _name;
    }
    
    public void setName(String name) {
        _name = name;
    }
}

class EmployeeBefore {
    private Person _person = new Person();
    
    public String getName() {
        return _person.getName();
    }
    
    public void setName(String name) {
        _person.setName(name);
    }
    
    public String toString() {
        return "Emp: " + _person.getName();
    }
}

