package com.refactoring.chapter7.movingfeatures.movefield;

/**
 * Supporting AccountType class for Move Field example
 * 
 * AFTER refactoring: This class contains the _interestRate field
 * that was moved from Account.
 */
public class AccountType {
    private String _name;
    private double _interestRate;
    
    public AccountType(String name, double interestRate) {
        this._name = name;
        this._interestRate = interestRate;
    }
    
    public String getName() {
        return _name;
    }
    
    public double getInterestRate() {
        return _interestRate;
    }
}

