package com.refactoring.chapter6.composingmethods.splittemporaryvariable;

/**
 * Split Temporary Variable - BEFORE Refactoring
 * 
 * The variable 'acc' is assigned to twice and has two responsibilities:
 * 1. Hold the initial acceleration caused by the first force
 * 2. Hold the acceleration with both forces
 * 
 * This should be split into two separate variables.
 */
public class DistanceCalculatorBefore {
    private Haggis _haggis;
    
    public DistanceCalculatorBefore(Haggis haggis) {
        this._haggis = haggis;
    }
    
    double getDistanceTravelled(int time) {
        double result;
        double acc = _haggis.getPrimaryForce() / _haggis.getMass();
        int primaryTime = Math.min(time, _haggis.getDelay());
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _haggis.getDelay();
        if (secondaryTime > 0) {
            double primaryVel = acc * _haggis.getDelay();
            acc = (_haggis.getPrimaryForce() + _haggis.getSecondaryForce()) / _haggis.getMass();
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}

