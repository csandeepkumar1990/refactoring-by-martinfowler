package com.refactoring.chapter6.composingmethods.replacemethodwithmethodobject;

/**
 * Replace Method with Method Object - AFTER Refactoring
 * 
 * The method has been turned into a method object. All local variables are now
 * fields on the object, making it easy to extract methods without worrying about
 * parameter passing.
 */
public class AccountAfter extends Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }
}

/**
 * Method object that contains all the local variables as fields.
 * This allows easy decomposition using Extract Method.
 */
class Gamma {
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;
    
    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }
    
    int compute() {
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        importantValue3 = importantValue2 * 7;
        // and so on.
        return importantValue3 - 2 * importantValue1;
    }
    
    void importantThing() {
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
    }
}

