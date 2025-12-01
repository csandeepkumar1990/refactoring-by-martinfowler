package com.refactoring.chapter7.movingfeatures.movemethod;

/**
 * Move Method - BEFORE Refactoring
 * 
 * The overdraftCharge() method uses more features of AccountType than Account.
 * It should be moved to AccountType where it logically belongs.
 */
public class AccountBefore {
    private AccountType _type;
    private int _daysOverdrawn;
    
    public AccountBefore(AccountType type, int daysOverdrawn) {
        this._type = type;
        this._daysOverdrawn = daysOverdrawn;
    }
    
    double overdraftCharge() {
        if (_type.isPremium()) {
            double result = 10;
            if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) * 0.85;
            return result;
        } else {
            return _daysOverdrawn * 1.75;
        }
    }
    
    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }
}

