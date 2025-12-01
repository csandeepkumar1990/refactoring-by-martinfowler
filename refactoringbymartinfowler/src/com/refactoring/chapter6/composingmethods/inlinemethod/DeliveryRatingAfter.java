package com.refactoring.chapter6.composingmethods.inlinemethod;

/**
 * Inline Method - AFTER Refactoring
 * 
 * The method moreThanFiveLateDeliveries() has been inlined because its body
 * (_numberOfLateDeliveries > 5) was already as clear as the method name.
 * Reading "_numberOfLateDeliveries > 5" directly in getRating() is just as
 * understandable as calling moreThanFiveLateDeliveries(), so the indirection
 * was removed to make the code more direct.
 */
public class DeliveryRatingAfter {
    private int _numberOfLateDeliveries;
    
    public DeliveryRatingAfter(int numberOfLateDeliveries) {
        this._numberOfLateDeliveries = numberOfLateDeliveries;
    }
    
    int getRating() {
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }
}

