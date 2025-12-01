package com.refactoring.chapter8.organizingdata.replacemagicnumberwithsymbolicconstant;

/**
 * Replace Magic Number with Symbolic Constant - AFTER Refactoring
 * 
 * Magic numbers have been replaced with named constants.
 * This makes the code self-documenting and easier to maintain.
 */
public class CalculatorAfter {
    private static final double GRAVITATIONAL_CONSTANT = 9.81;
    private static final double PI = 3.14159;
    private static final double TWO = 2.0;
    
    double potentialEnergy(double mass, double height) {
        return mass * GRAVITATIONAL_CONSTANT * height;
    }
    
    double circumference(double radius) {
        return TWO * PI * radius;
    }
}

