package com.refactoring.chapter6.composingmethods.inlinemethod;

/**
 * Inline Method - BEFORE Refactoring
 * 
 * The method body (_numberOfLateDeliveries > 5) is as clear and self-explanatory
 * as the method name (moreThanFiveLateDeliveries). The method name doesn't add
 * any clarity beyond what the code already says, so we inline it to remove
 * unnecessary indirection.
 * 
 * When you read "_numberOfLateDeliveries > 5", it's immediately clear what it does.
 * Having a separate method for this simple expression is overkill.
 */
public class DeliveryRatingBefore {
    private int _numberOfLateDeliveries;
    
    public DeliveryRatingBefore(int numberOfLateDeliveries) {
        this._numberOfLateDeliveries = numberOfLateDeliveries;
    }
    
    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }
    
    boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}

