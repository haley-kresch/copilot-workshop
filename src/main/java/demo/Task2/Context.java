package demo.Task2;

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

    public static void main(String[] args) {
        // Starter output
        System.out.println("Sample scores: " + SAMPLE_SCORES);

    }
}
