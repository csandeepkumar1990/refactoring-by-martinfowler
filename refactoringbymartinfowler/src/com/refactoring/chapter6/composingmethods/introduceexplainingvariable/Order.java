package com.refactoring.chapter6.composingmethods.introduceexplainingvariable;

/**
 * Supporting Order class for Introduce Explaining Variable example
 */
public class Order {
    private int _quantity;
    private double _itemPrice;
    
    public Order(int quantity, double itemPrice) {
        this._quantity = quantity;
        this._itemPrice = itemPrice;
    }
    
    public int getQuantity() {
        return _quantity;
    }
    
    public double getItemPrice() {
        return _itemPrice;
    }
}

