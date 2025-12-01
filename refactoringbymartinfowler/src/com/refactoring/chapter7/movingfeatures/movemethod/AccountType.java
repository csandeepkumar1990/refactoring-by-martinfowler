package com.refactoring.chapter7.movingfeatures.movemethod;

/**
 * Supporting AccountType class for Move Method example
 * 
 * AFTER refactoring: This class contains the overdraftCharge method
 * that was moved from Account.
 */
public class AccountType {
    private boolean _premium;
    
    public AccountType(boolean premium) {
        this._premium = premium;
    }
    
    public boolean isPremium() {
        return _premium;
    }
    
    // This method was moved from Account in the refactoring
    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}

