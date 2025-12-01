package com.refactoring.chapter8.organizingdata.changereferencetovalue;

/**
 * Change Reference to Value - BEFORE Refactoring
 * 
 * Money uses a Currency reference object. If Currency should be immutable
 * and equality-based (value object), we should change it to a value.
 */
public class MoneyBefore {
    private double _amount;
    private Currency _currency;
    
    public MoneyBefore(double amount, Currency currency) {
        _amount = amount;
        _currency = currency;
    }
    
    public double getAmount() {
        return _amount;
    }
    
    public Currency getCurrency() {
        return _currency;
    }
}

