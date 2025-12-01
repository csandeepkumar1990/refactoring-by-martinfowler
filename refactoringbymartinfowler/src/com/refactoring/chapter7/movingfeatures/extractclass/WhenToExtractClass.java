package com.refactoring.chapter7.movingfeatures.extractclass;

/**
 * WHEN TO EXTRACT CLASS - Decision Guide
 * 
 * This guide helps you identify when you need to extract a class
 * and when it's appropriate to do the refactoring.
 */
public class WhenToExtractClass {
    
    /**
     * SIGNS THAT YOU NEED EXTRACT CLASS (The "Before" State):
     * 
     * 1. CLASS HAS TOO MANY RESPONSIBILITIES
     *    - Look for groups of fields/methods that work together
     *    - If you can describe what a group does in one sentence,
     *      it might be a separate class
     *    - Example: Person has name (person data) AND telephone fields (telephone data)
     * 
     * 2. CLASS HAS TOO MANY FIELDS
     *    - More than 6-7 instance variables is often a sign
     *    - Look for fields that are always used together
     *    - Example: _officeAreaCode and _officeNumber are always used together
     * 
     * 3. SUBSETS OF DATA ARE ALWAYS USED TOGETHER
     *    - If certain fields are always accessed together, they might belong together
     *    - Example: Every time you use _officeAreaCode, you also use _officeNumber
     * 
     * 4. YOU CAN DESCRIBE THE CLASS WITH "AND"
     *    - "This class handles person data AND telephone data"
     *    - "This class manages orders AND inventory"
     *    - The "AND" suggests multiple responsibilities
     * 
     * 5. SOME METHODS ONLY USE A SUBSET OF FIELDS
     *    - If getTelephoneNumber() only uses _officeAreaCode and _officeNumber,
     *      but not _name, that's a sign
     *    - Methods that work with a subset suggest those fields belong together
     */
    
    /**
     * EXAMPLE: How to identify the need for Extract Class
     */
    public class PersonExample {
        // Person data
        private String _name;
        
        // Telephone data - these are ALWAYS used together
        private String _officeAreaCode;  // ← Notice: telephone-related
        private String _officeNumber;     // ← Notice: telephone-related
        
        // QUESTION: Do these fields belong together?
        // ANSWER: Yes! They're always used together for telephone operations
        
        public String getTelephoneNumber() {
            // This method ONLY uses telephone fields, not _name
            // That's a sign they should be extracted!
            return "(" + _officeAreaCode + ") " + _officeNumber;
        }
        
        public String getName() {
            // This method ONLY uses person data
            return _name;
        }
        
        // PATTERN: Methods that only use telephone fields suggest
        // those fields should be in a TelephoneNumber class
    }
    
    /**
     * WHEN TO DO THE REFACTORING:
     * 
     * 1. DO IT WHEN:
     *    - You're adding a new feature that would make the class even bigger
     *    - You find yourself thinking "this class does too much"
     *    - You're having trouble understanding what the class does
     *    - You want to reuse part of the class elsewhere
     *    - You have tests in place (safety net)
     * 
     * 2. DON'T DO IT WHEN:
     *    - The class is small and cohesive (3-4 fields, clear purpose)
     *    - You don't have tests (too risky)
     *    - You're in the middle of a critical bug fix
     *    - The extraction would create unnecessary complexity
     * 
     * 3. THE DECISION PROCESS:
     *    Step 1: Look at your class - can you describe it without "and"?
     *            "Person manages person data" ✓ Good
     *            "Person manages person data AND telephone data" ✗ Extract needed
     *    
     *    Step 2: Look for field groups that are always used together
     *            _officeAreaCode + _officeNumber = TelephoneNumber candidate
     *    
     *    Step 3: Check if methods only use a subset of fields
     *            getTelephoneNumber() only uses telephone fields = Extract candidate
     *    
     *    Step 4: If you find these patterns, Extract Class is appropriate
     */
    
    /**
     * PRACTICAL CHECKLIST:
     * 
     * Ask yourself:
     * [ ] Does this class have more than one clear responsibility?
     * [ ] Are there groups of fields that are always used together?
     * [ ] Do some methods only use a subset of the class's fields?
     * [ ] Can I describe what this class does using "and"?
     * [ ] Would extracting make the code clearer?
     * [ ] Do I have tests to verify the refactoring?
     * 
     * If you answer "yes" to 3+ questions, Extract Class is likely needed.
     */
    
    /**
     * REAL-WORLD EXAMPLE FROM THE CODE:
     * 
     * PersonBefore has:
     * - _name (person responsibility)
     * - _officeAreaCode, _officeNumber (telephone responsibility)
     * 
     * Signs it needs extraction:
     * ✓ Two distinct responsibilities (person + telephone)
     * ✓ Telephone fields always used together
     * ✓ getTelephoneNumber() only uses telephone fields
     * ✓ Can describe as "Person handles person data AND telephone data"
     * 
     * Therefore: Extract Class is appropriate!
     */
}

