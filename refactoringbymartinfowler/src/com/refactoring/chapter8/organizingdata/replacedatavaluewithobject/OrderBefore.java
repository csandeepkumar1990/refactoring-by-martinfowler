package com.refactoring.chapter8.organizingdata.replacedatavaluewithobject;

/**
 * Replace Data Value with Object - BEFORE Refactoring
 * 
 * The customer field is just a String. As the system grows, we may need
 * to store more information about customers (address, credit rating, etc.).
 * We should replace the String with a Customer object.
 */
public class OrderBefore {
    private String _customer;
    
    public OrderBefore(String customer) {
        _customer = customer;
    }
    
    public String getCustomer() {
        return _customer;
    }
    
    public void setCustomer(String arg) {
        _customer = arg;
    }
}

