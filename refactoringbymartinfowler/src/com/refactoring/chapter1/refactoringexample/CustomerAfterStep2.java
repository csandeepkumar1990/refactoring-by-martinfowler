package com.refactoring.chapter1.refactoringexample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Chapter 1: Refactoring Example - AFTER Step 2: Move Method
 * 
 * Second refactoring: Move the amountFor() method to the Rental class
 * where it logically belongs, since it uses more Rental data than Customer data.
 */
public class CustomerAfterStep2 {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();
    
    public CustomerAfterStep2(String name) {
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
            Rental each = rentals.nextElement();
            double thisAmount = amountFor(each);
            
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
    
    private double amountFor(Rental each) {
        double result = 0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (each.getDaysRented() > 2)
                    result += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (each.getDaysRented() > 3)
                    result += (each.getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}

/**
 * NOTE: In a real refactoring, you would move getCharge() to Rental class.
 * This example shows the concept - the method has been extracted and could
 * be moved to Rental where it belongs.
 */
class RentalAfterStep2 {
    private Movie _movie;
    private int _daysRented;
    
    public RentalAfterStep2(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }
    
    double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}

