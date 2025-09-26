package demo;

import java.util.Arrays;
import java.util.List;

/**
 * Context
 *
 * Focus: Using CONTEXT and BACKGROUND in prompt engineering with Copilot.
 *
 * ➡️ Context = domain, audience, task details
 * ➡️ Background = relevant data, assumptions, prior steps
 *
 * Explicit context + background = deterministic, testable outputs.
 *
 * Students should experiment with adding clarity and background info
 * to prompts, and compare Copilot’s output quality.
 */
public class Context {

    /**
     * Example Data (Background):
     * A list of student scores to be used in prompt exercises.
     */
    private static final List<Integer> SAMPLE_SCORES =
            Arrays.asList(90, 85, 70, 100, 60);

    /**
     * TODO Exercise 1:
     * Give Copilot a minimal, vague context.
     * Example: "Add a method to process scores."
     *
     * Observe: Copilot may generate many different interpretations.
     */

    /**
     * TODO Exercise 2:
     * Add explicit CONTEXT (domain, audience, task).
     * Example: "Add a method for teachers that calculates the class average
     * from a list of student scores."
     */

    /**
     * TODO Exercise 3:
     * Add both CONTEXT + BACKGROUND (data, assumptions, prior steps).
     * Example: "Add a static method named calculatePassRate(List<Integer> scores)
     * that:
     *   - Uses a passing threshold of 70
     *   - Returns a double between 0.0 and 1.0 representing the ratio of students passing
     *   - Assumes scores are integers between 0 and 100
     *   - Includes JavaDoc with @param and @return
     *   - Has deterministic, testable behavior"
     */

    public static void main(String[] args) {
        // Starter output
        System.out.println("Sample scores: " + SAMPLE_SCORES);

        // TODO: After generating methods with Copilot, test them here.
        // Example (after generating calculatePassRate):
        // double passRate = calculatePassRate(SAMPLE_SCORES);
        // System.out.println("Pass Rate: " + passRate);
    }
}
