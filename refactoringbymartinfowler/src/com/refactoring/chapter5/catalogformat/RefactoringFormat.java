package com.refactoring.chapter5.catalogformat;

/**
 * Chapter 5: Toward a Catalog of Refactorings
 * 
 * This chapter describes the format used for documenting refactorings
 * throughout the book.
 * 
 * REFACTORING FORMAT:
 * 
 * 1. NAME: A short, descriptive name for the refactoring
 * 
 * 2. SKETCH: A before/after code example showing the transformation
 * 
 * 3. MOTIVATION: Why you would want to do this refactoring
 * 
 * 4. MECHANICS: Step-by-step instructions for performing the refactoring
 * 
 * 5. EXAMPLES: Detailed examples showing the refactoring in practice
 * 
 * Example format used in this codebase:
 * - Before.java: Shows the code before refactoring
 * - After.java: Shows the code after refactoring
 * - Comments explain the motivation and mechanics
 */
public class RefactoringFormat {
    
    /**
     * Example of the format:
     * 
     * REFACTORING: Extract Method
     * 
     * MOTIVATION:
     * You have a code fragment that can be grouped together.
     * Turn the fragment into a method whose name explains the purpose.
     * 
     * MECHANICS:
     * 1. Create a new method, and name it after the intention
     * 2. Copy the extracted code into the new method
     * 3. Replace the extracted code with a call to the new method
     * 4. Compile and test
     * 
     * This format is used consistently throughout all refactoring examples
     * in chapters 6-11.
     */
}

