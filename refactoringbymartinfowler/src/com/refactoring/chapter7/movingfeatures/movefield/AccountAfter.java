package com.refactoring.chapter7.movingfeatures.movefield;

/**
 * Move Field - AFTER Refactoring
 * 
 * The _interestRate field has been moved to AccountType where it belongs.
 * Account now accesses it through the AccountType object.
 */
public class AccountAfter {
    private AccountType _type;
    
    public AccountAfter(AccountType type) {
        this._type = type;
    }
    
    public AccountType getType() {
        return _type;
    }
    
    double interestForAmount_days(double amount, int days) {
        return _type.getInterestRate() * amount * days / 365;
    }
}


