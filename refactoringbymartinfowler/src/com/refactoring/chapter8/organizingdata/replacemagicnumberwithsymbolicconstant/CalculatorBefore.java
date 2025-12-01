package com.refactoring.chapter8.organizingdata.replacemagicnumberwithsymbolicconstant;

/**
 * Replace Magic Number with Symbolic Constant - BEFORE Refactoring
 * 
 * The code uses magic numbers (2.0) which are hard to understand.
 * We should replace them with named constants.
 */
public class CalculatorBefore {
    double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }
    
    double circumference(double radius) {
        return 2.0 * 3.14159 * radius;
    }
}

