package demo;

import java.util.Arrays;

/**
 * ChainOfThought
 *
 * Focus: CHAIN-OF-THOUGHT prompting with GitHub Copilot in IntelliJ.
 *
 * ➡️ Guides Copilot to reason step by step.
 * ➡️ Useful for complex problems where intermediate reasoning matters.
 * ➡️ Ask for explanations BEFORE answers.
 *
 * Best Practices:
 *  - Request numbered, step-by-step reasoning
 *  - Show intermediate values
 *  - Summarize with the final answer
 */
public class ChainOfThought {

    /**
     * TODO Exercise 1:
     * Give a vague prompt.
     * Example: "Add a method to calculate factorial."
     * ➡️ Observe: Copilot may only return the result, no reasoning.
     */

    /**
     * TODO Exercise 2:
     * Add clarity by asking for reasoning.
     * Example: "Add a method computeFactorialWithSteps(int n) that:
     *   - Prints each multiplication step
     *   - Returns the final result"
     */

    /**
     * TODO Exercise 3:
     * Use full chain-of-thought prompting.
     * Example: "Add a method solveQuadraticWithExplanation(double a, double b, double c) that:
     *   - Explains discriminant calculation step by step
     *   - Shows intermediate values
     *   - Returns an array of roots (or empty if complex)"
     */

    // Example starter method to show testing format
    public static void demoSteps() {
        System.out.println("Step 1: Start with a simple example");
        System.out.println("Step 2: Show reasoning explicitly");
        System.out.println("Summary: Demo complete!");
    }

    public static void main(String[] args) {
        demoSteps();

        // TODO: After generating methods with Copilot, test them here.
        // Example (after generating factorial with steps):
        // System.out.println(computeFactorialWithSteps(5));
        //
        // Example (after generating quadratic solver):
        // double[] roots = solveQuadraticWithExplanation(1, -3, 2);
        // System.out.println("Roots: " + Arrays.toString(roots));
    }
}

