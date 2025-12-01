package com.refactoring.chapter7.movingfeatures.movemethod;

/**
 * Move Method - AFTER Refactoring
 * 
 * The overdraftCharge() method has been moved to AccountType where it belongs.
 * It now takes the daysOverdrawn as a parameter since it's needed for the calculation.
 */
public class AccountAfter {
    private AccountType _type;
    private int _daysOverdrawn;
    
    public AccountAfter(AccountType type, int daysOverdrawn) {
        this._type = type;
        this._daysOverdrawn = daysOverdrawn;
    }
    
    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
        return result;
    }
}


