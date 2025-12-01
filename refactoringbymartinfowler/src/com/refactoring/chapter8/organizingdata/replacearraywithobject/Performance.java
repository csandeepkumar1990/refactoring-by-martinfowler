package com.refactoring.chapter8.organizingdata.replacearraywithobject;

/**
 * Supporting Performance class for Replace Array with Object example
 */
public class Performance {
    private String _name;
    private int _wins;
    private int _losses;
    
    public Performance(String name, int wins, int losses) {
        _name = name;
        _wins = wins;
        _losses = losses;
    }
    
    public String getName() {
        return _name;
    }
    
    public int getWins() {
        return _wins;
    }
    
    public int getLosses() {
        return _losses;
    }
}

