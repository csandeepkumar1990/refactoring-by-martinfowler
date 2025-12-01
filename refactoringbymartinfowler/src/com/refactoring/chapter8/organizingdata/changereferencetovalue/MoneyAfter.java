package com.refactoring.chapter8.organizingdata.changereferencetovalue;

/**
 * Change Reference to Value - AFTER Refactoring
 * 
 * Currency is now a value object. Each Money instance can have its own
 * Currency instance, and equality is based on the currency code, not identity.
 */
public class MoneyAfter {
    private double _amount;
    private Currency _currency;
    
    public MoneyAfter(double amount, Currency currency) {
        _amount = amount;
        _currency = currency;
    }
    
    public double getAmount() {
        return _amount;
    }
    
    public Currency getCurrency() {
        return _currency;
    }
    
    public boolean equals(Object arg) {
        if (!(arg instanceof MoneyAfter)) return false;
        MoneyAfter other = (MoneyAfter) arg;
        return _amount == other._amount && _currency.equals(other._currency);
    }
}

