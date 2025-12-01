package com.refactoring.chapter8.organizingdata.replacearraywithobject;

/**
 * Replace Array with Object - AFTER Refactoring
 * 
 * The array has been replaced with a Performance object that has
 * named fields. This makes the code much more readable and maintainable.
 */
public class PerformanceAfter {
    public static void main(String[] args) {
        Performance row = new Performance("Liverpool", 15, 10);
        
        String name = row.getName();
        int wins = row.getWins();
        int losses = row.getLosses();
    }
}

