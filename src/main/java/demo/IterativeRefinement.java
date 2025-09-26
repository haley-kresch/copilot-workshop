package demo;

import java.util.Arrays;
import java.util.List;

/**
 * IterativeRefinement
 *
 * Focus: ITERATIVE REFINEMENT with GitHub Copilot in IntelliJ.
 *
 * ➡️ Start with a draft answer.
 * ➡️ Refine step-by-step using feedback.
 * ➡️ Reduces mistakes & improves clarity.
 * ➡️ Useful for code reviews, design, documentation, and reports.
 */
public class IterativeRefinement {

    // Example data for generating and refining reports
    private static final List<Integer> SAMPLE_SCORES = Arrays.asList(88, 73, 95, 60, 77, 84);

    /**
     * TODO Exercise 1 (vague):
     * Prompt: "Add a method to generate a simple report from scores."
     * Observe: Copilot may produce a single draft without refinements.
     */

    /**
     * TODO Exercise 2 (clear):
     * Prompt: "Add a method generateDraftReport(List<Integer> scores)
     *   - Shows student count, average, min, max, and all scores"
     */

    /**
     * TODO Exercise 3 (iterative refinement):
     * Prompt: "Add a method refineReport(String draft, String feedback, List<Integer> scores)
     *   - Applies one small, deterministic change per feedback round
     *   - Examples:
     *       - 'Add pass rate' → append pass rate with threshold 70
     *       - 'Make concise' → return a single-line summary
     *       - 'Return JSON' → convert report to JSON"
     */

    /**
     * TODO Exercise 4 (advanced / code review simulation):
     * Prompt: "Add a method iterativeRefinement(List<Integer> scores, List<String> feedbackRounds)
     *   - Returns a history of drafts after each feedback
     *   - Shows changes applied step by step"
     */

    // Starter method to show testing structure
    public static String generateDraftReport(List<Integer> scores) {
        return "Draft Report (student count: " + scores.size() + ", scores: " + scores + ")";
    }

    public static void main(String[] args) {
        // Generate initial draft
        String draft = generateDraftReport(SAMPLE_SCORES);
        System.out.println("Initial draft:\n" + draft + "\n");

        // Example feedback rounds
        List<String> feedbackRounds = Arrays.asList(
                "Add pass rate",
                "Make concise",
                "Return JSON"
        );

        // TODO: Use Copilot to implement iterativeRefinement that applies each feedback round
        System.out.println("Feedback rounds (to refine draft): " + feedbackRounds);
        System.out.println("Run iterativeRefinement(...) after implementing with Copilot.");
    }
}

