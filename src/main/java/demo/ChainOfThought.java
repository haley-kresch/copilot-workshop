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

    // Example starter method to show testing format
    public static void demoSteps() {
        System.out.println("Step 1: Start with a simple example");
        System.out.println("Step 2: Show reasoning explicitly");
        System.out.println("Summary: Demo complete!");
    }

    public static void main(String[] args) {
        demoSteps();

        // After generating methods with Copilot, test them here.
        // Example (after generating factorial with steps):
        // System.out.println(computeFactorialWithSteps(5));
        //
        // Example (after generating quadratic solver):
        // double[] roots = solveQuadraticWithExplanation(1, -3, 2);
        // System.out.println("Roots: " + Arrays.toString(roots));
    }
}
