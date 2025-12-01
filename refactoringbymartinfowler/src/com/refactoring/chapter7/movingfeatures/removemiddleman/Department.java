package com.refactoring.chapter7.movingfeatures.removemiddleman;

/**
 * Supporting Department class for Remove Middle Man example
 */
public class Department {
    private String _name;
    private String _code;
    private PersonBefore _manager;
    
    public Department(String name, String code, PersonBefore manager) {
        this._name = name;
        this._code = code;
        this._manager = manager;
    }
    
    public PersonBefore getManager() {
        return _manager;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getCode() {
        return _code;
    }
}

