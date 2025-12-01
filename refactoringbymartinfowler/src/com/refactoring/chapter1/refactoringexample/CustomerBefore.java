package com.refactoring.chapter1.refactoringexample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Chapter 1: Refactoring Example - BEFORE Refactoring
 * 
 * This is the starting point from Chapter 1. The statement() method is long
 * and does too much. It will be refactored through multiple steps to demonstrate
 * various refactoring techniques.
 * 
 * Problems:
 * - Long method with too many responsibilities
 * - Duplicated code for calculating charges
 * - Conditional logic based on price code
 * - Hard to extend with new movie types
 */
public class CustomerBefore {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();
    
    public CustomerBefore(String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentals.nextElement();
            
            // determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
            
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                each.getDaysRented() > 1)
                frequentRenterPoints++;
            
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                     String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                 " frequent renter points";
        return result;
    }
}

