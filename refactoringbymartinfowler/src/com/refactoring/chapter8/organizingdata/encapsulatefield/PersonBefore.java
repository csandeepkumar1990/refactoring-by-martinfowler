package com.refactoring.chapter8.organizingdata.encapsulatefield;

/**
 * Encapsulate Field - BEFORE Refactoring
 * 
 * The _name field is public, allowing direct access from outside the class.
 * We should make it private and provide accessor methods.
 */
public class PersonBefore {
    public String _name;
}

