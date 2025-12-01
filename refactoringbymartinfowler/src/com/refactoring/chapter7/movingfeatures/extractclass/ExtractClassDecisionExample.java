package com.refactoring.chapter7.movingfeatures.extractclass;

/**
 * EXTRACT CLASS - Decision Making Example
 * 
 * This shows you HOW TO RECOGNIZE when you need Extract Class
 */
public class ExtractClassDecisionExample {
    
    /**
     * EXAMPLE 1: NEEDS EXTRACTION (Like PersonBefore)
     * 
     * Look at this class and ask:
     */
    public class PersonNeedsExtraction {
        // Group 1: Person data
        private String _name;
        
        // Group 2: Telephone data - ALWAYS used together!
        private String _officeAreaCode;  // ← These two
        private String _officeNumber;    // ← are always together
        
        // RED FLAGS:
        // ✓ Two distinct groups of fields
        // ✓ Telephone fields always used together
        // ✓ Methods like getTelephoneNumber() only use telephone fields
        // ✓ Can describe as "Person handles person AND telephone"
        
        public String getTelephoneNumber() {
            // This method ONLY uses telephone fields
            // Never uses _name - that's a sign!
            return "(" + _officeAreaCode + ") " + _officeNumber;
        }
    }
    
    /**
     * EXAMPLE 2: DOESN'T NEED EXTRACTION
     * 
     * This class is fine - all fields belong together
     */
    public class PersonNoExtraction {
        private String _name;
        private String _email;
        private int _age;
        
        // All fields are person-related
        // No distinct groups
        // All methods use person data
        // Single responsibility: "Person manages person data"
        
        public String getFullInfo() {
            // Uses all person fields together - that's good!
            return _name + " (" + _age + ") - " + _email;
        }
    }
    
    /**
     * EXAMPLE 3: CLEAR CANDIDATE FOR EXTRACTION
     * 
     * This class clearly has two responsibilities
     */
    public class EmployeeNeedsExtraction {
        // Group 1: Employee data
        private String _name;
        private String _employeeId;
        
        // Group 2: Address data - distinct group!
        private String _street;
        private String _city;
        private String _zipCode;
        
        // RED FLAGS:
        // ✓ Two clear groups (employee + address)
        // ✓ Address fields always used together
        // ✓ getFullAddress() only uses address fields
        // ✓ Can describe as "Employee handles employee data AND address data"
        
        public String getFullAddress() {
            // Only uses address fields - should be in Address class!
            return _street + ", " + _city + " " + _zipCode;
        }
    }
    
    /**
     * THE DECISION PROCESS - STEP BY STEP:
     * 
     * Step 1: Look at the fields
     *    PersonBefore has: _name, _officeAreaCode, _officeNumber
     *    Question: Do these all belong together?
     *    Answer: _name is person data, but _officeAreaCode/_officeNumber are telephone data
     *    → Two groups detected!
     * 
     * Step 2: Check how fields are used
     *    getTelephoneNumber() uses: _officeAreaCode, _officeNumber
     *    getName() uses: _name
     *    Question: Do methods use all fields or subsets?
     *    Answer: Methods use subsets - that's a sign!
     * 
     * Step 3: Try to describe the class
     *    "Person handles person data AND telephone data"
     *    Question: Can you say it without "and"?
     *    Answer: No - that means multiple responsibilities!
     * 
     * Step 4: Decision
     *    If you found:
     *    - Multiple field groups ✓
     *    - Methods using subsets ✓
     *    - Need "and" to describe it ✓
     *    → EXTRACT CLASS is needed!
     */
    
    /**
     * QUICK CHECKLIST:
     * 
     * Look at your class and check:
     * 
     * [ ] Can I group the fields into distinct categories?
     *      PersonBefore: ✓ Person fields (_name) + Telephone fields (_officeAreaCode, _officeNumber)
     * 
     * [ ] Do some methods only use a subset of fields?
     *      PersonBefore: ✓ getTelephoneNumber() only uses telephone fields
     * 
     * [ ] Can I describe the class using "and"?
     *      PersonBefore: ✓ "Person handles person data AND telephone data"
     * 
     * [ ] Would extracting make the code clearer?
     *      PersonBefore: ✓ Yes - Person would only handle person data
     * 
     * If 3+ checks are YES → Extract Class!
     */
}

