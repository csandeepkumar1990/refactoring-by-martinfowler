package com.refactoring.chapter7.movingfeatures.movefield;

/**
 * Move Field - BEFORE Refactoring
 * 
 * The _interestRate field is used more by AccountType than Account.
 * It should be moved to AccountType where it logically belongs.
 */
public class AccountBefore {
    private double _interestRate;
    
    public AccountBefore(double interestRate) {
        this._interestRate = interestRate;
    }
    
    double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}

