package com.refactoring.chapter4.buildingtests;

/**
 * Chapter 4: Building Tests
 * 
 * This chapter emphasizes the importance of self-testing code.
 * 
 * Key Points:
 * 1. Tests are essential for refactoring - they give you confidence
 * 2. Write tests before refactoring
 * 3. Run tests frequently during refactoring
 * 4. Use JUnit or similar testing framework
 * 
 * Example: Simple test using JUnit-style assertions
 */
public class CalculatorTest {
    
    /**
     * Example test method (JUnit-style)
     * In real JUnit, this would be annotated with @Test
     */
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assert result == 5 : "Expected 5, got " + result;
    }
    
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtract(5, 3);
        assert result == 2 : "Expected 2, got " + result;
    }
    
    /**
     * The key principle: Tests should be:
     * - Fast: Run quickly
     * - Independent: Don't depend on each other
     * - Repeatable: Same results every time
     * - Self-validating: Pass or fail clearly
     * - Timely: Written before the code they test
     */
}

/**
 * Simple calculator for testing example
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
}

