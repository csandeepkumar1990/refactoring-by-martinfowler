package com.refactoring.chapter14.refactoringtools;

/**
 * Chapter 14: Refactoring Tools
 * 
 * This chapter discusses the importance of refactoring tools and
 * what makes a good refactoring tool.
 * 
 * 1. WHY TOOLS MATTER:
 *    - Manual refactoring is error-prone
 *    - Tools can perform refactorings safely
 *    - Tools can refactor across large codebases
 *    - Tools ensure consistency
 * 
 * 2. TECHNICAL CRITERIA FOR A REFACTORING TOOL:
 *    - Must preserve program behavior
 *    - Must handle all language constructs correctly
 *    - Must update all references
 *    - Must handle edge cases
 *    - Must be fast enough for interactive use
 * 
 * 3. PRACTICAL CRITERIA:
 *    - Easy to use
 *    - Integrated with IDE
 *    - Provides preview of changes
 *    - Can undo refactorings
 *    - Handles errors gracefully
 * 
 * 4. COMMON REFACTORING TOOLS:
 *    - IDE built-in refactorings (IntelliJ, Eclipse, VS Code)
 *    - Automated refactoring tools
 *    - Static analysis tools that suggest refactorings
 * 
 * EXAMPLE: Using IDE refactoring tools
 */
public class RefactoringTools {
    
    /**
     * Example: Extract Method using IDE tool
     * 
     * BEFORE: Select code block, right-click, "Extract Method"
     * Tool automatically:
     * - Creates new method
     * - Replaces code with method call
     * - Handles parameters and return values
     * - Updates all references
     */
    public void exampleBefore() {
        // Some complex calculation
        double result = 0;
        for (int i = 0; i < 10; i++) {
            result += i * 2;
        }
        System.out.println("Result: " + result);
    }
    
    /**
     * AFTER: Tool automatically creates:
     */
    public void exampleAfter() {
        double result = calculateResult();
        System.out.println("Result: " + result);
    }
    
    private double calculateResult() {
        double result = 0;
        for (int i = 0; i < 10; i++) {
            result += i * 2;
        }
        return result;
    }
    
    /**
     * BENEFITS OF TOOLS:
     * - Reduces errors
     * - Saves time
     * - Makes refactoring accessible to all developers
     * - Encourages more refactoring
     */
}

