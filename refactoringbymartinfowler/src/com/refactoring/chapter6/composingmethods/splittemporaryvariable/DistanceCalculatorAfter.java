package com.refactoring.chapter6.composingmethods.splittemporaryvariable;

/**
 * Split Temporary Variable - AFTER Refactoring
 * 
 * The variable 'acc' has been split into 'primaryAcc' and 'secondaryAcc',
 * each with a single, clear responsibility. This makes the code much clearer.
 */
public class DistanceCalculatorAfter {
    private Haggis _haggis;
    
    public DistanceCalculatorAfter(Haggis haggis) {
        this._haggis = haggis;
    }
    
    double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = _haggis.getPrimaryForce() / _haggis.getMass();
        int primaryTime = Math.min(time, _haggis.getDelay());
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - _haggis.getDelay();
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * _haggis.getDelay();
            final double secondaryAcc = (_haggis.getPrimaryForce() + _haggis.getSecondaryForce()) / _haggis.getMass();
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }
}

