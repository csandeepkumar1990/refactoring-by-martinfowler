package com.refactoring.chapter7.movingfeatures.hidedelegate;

/**
 * Supporting Department class for Hide Delegate example
 */
public class Department {
    private String _chargeCode;
    private PersonBefore _manager;
    
    public Department(String chargeCode, PersonBefore manager) {
        this._chargeCode = chargeCode;
        this._manager = manager;
    }
    
    public PersonBefore getManager() {
        return _manager;
    }
}

