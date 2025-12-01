package com.refactoring.chapter6.composingmethods.substitutealgorithm;

/**
 * Substitute Algorithm - BEFORE Refactoring
 * 
 * The algorithm uses a series of if statements to find a person.
 * This can be replaced with a clearer algorithm using a list and contains check.
 */
public class PersonFinderBefore {
    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }
}

