package com.refactoring.chapter8.organizingdata.replacearraywithobject;

/**
 * Replace Array with Object - BEFORE Refactoring
 * 
 * The code uses an array to store performance data. Arrays with
 * positional elements are hard to understand. We should replace
 * it with an object with named fields.
 */
public class PerformanceBefore {
    public static void main(String[] args) {
        String[] row = new String[3];
        row[0] = "Liverpool";
        row[1] = "15";
        row[2] = "10";
        
        String name = row[0];
        int wins = Integer.parseInt(row[1]);
        int losses = Integer.parseInt(row[2]);
    }
}

