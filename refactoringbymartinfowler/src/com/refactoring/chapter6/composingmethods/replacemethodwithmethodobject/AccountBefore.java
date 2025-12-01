package com.refactoring.chapter6.composingmethods.replacemethodwithmethodobject;

/**
 * Replace Method with Method Object - BEFORE Refactoring
 * 
 * This method has many local variables that make it difficult to extract methods.
 * The method is too complex to break down using Extract Method alone.
 */
public class AccountBefore extends Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;
        // and so on.
        return importantValue3 - 2 * importantValue1;
    }
}

