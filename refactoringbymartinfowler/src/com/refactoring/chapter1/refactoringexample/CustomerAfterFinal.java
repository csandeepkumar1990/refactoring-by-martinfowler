package com.refactoring.chapter1.refactoringexample;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Chapter 1: Refactoring Example - FINAL VERSION
 * 
 * Final refactoring: Replace Conditional with Polymorphism.
 * The price calculation logic has been moved to Price subclasses,
 * eliminating the switch statement and making it easy to add new movie types.
 */
public class CustomerAfterFinal {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();
    
    public CustomerAfterFinal(String name) {
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
            RentalAfterFinal rental = new RentalAfterFinal(
                new MovieAfterFinal(each.getMovie().getTitle(), each.getMovie().getPriceCode()),
                each.getDaysRented()
            );
            double thisAmount = rental.getCharge();
            
            frequentRenterPoints += rental.getFrequentRenterPoints();
            
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
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

/**
 * Movie class with Price polymorphism
 */
class MovieAfterFinal {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    
    private String _title;
    private Price _price;
    
    public MovieAfterFinal(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    
    public int getPriceCode() {
        return _price.getPriceCode();
    }
    
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    public String getTitle() {
        return _title;
    }
    
    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
}

/**
 * Rental class with charge calculation delegated to Movie
 */
class RentalAfterFinal {
    private MovieAfterFinal _movie;
    private int _daysRented;
    
    public RentalAfterFinal(MovieAfterFinal movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public MovieAfterFinal getMovie() {
        return _movie;
    }
    
    double getCharge() {
        return _movie.getCharge(_daysRented);
    }
    
    int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}

/**
 * Abstract Price class - base for price strategies
 */
abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

/**
 * Regular price strategy
 */
class RegularPrice extends Price {
    int getPriceCode() {
        return MovieAfterFinal.REGULAR;
    }
    
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}

/**
 * New release price strategy
 */
class NewReleasePrice extends Price {
    int getPriceCode() {
        return MovieAfterFinal.NEW_RELEASE;
    }
    
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

/**
 * Children's price strategy
 */
class ChildrensPrice extends Price {
    int getPriceCode() {
        return MovieAfterFinal.CHILDRENS;
    }
    
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}

