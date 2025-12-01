package com.refactoring.chapter6.composingmethods.extractmethod.reassigninglocalvariables;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Supporting Customer class for Extract Method - Reassigning Local Variables example
 */
public class Customer {
    private String _name;
    private Vector<Order> _orders = new Vector<>();
    
    public Customer(String name) {
        this._name = name;
    }
    
    public void addOrder(Order order) {
        _orders.add(order);
    }
    
    public String getName() {
        return _name;
    }
    
    public Enumeration<Order> getOrders() {
        return _orders.elements();
    }
}

