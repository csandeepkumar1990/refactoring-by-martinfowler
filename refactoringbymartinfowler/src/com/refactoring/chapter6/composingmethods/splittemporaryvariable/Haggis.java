package com.refactoring.chapter6.composingmethods.splittemporaryvariable;

/**
 * Supporting Haggis class for Split Temporary Variable example
 */
public class Haggis {
    private double _primaryForce;
    private double _secondaryForce;
    private double _mass;
    private int _delay;
    
    public Haggis(double primaryForce, double secondaryForce, double mass, int delay) {
        this._primaryForce = primaryForce;
        this._secondaryForce = secondaryForce;
        this._mass = mass;
        this._delay = delay;
    }
    
    public double getPrimaryForce() {
        return _primaryForce;
    }
    
    public double getSecondaryForce() {
        return _secondaryForce;
    }
    
    public double getMass() {
        return _mass;
    }
    
    public int getDelay() {
        return _delay;
    }
}

