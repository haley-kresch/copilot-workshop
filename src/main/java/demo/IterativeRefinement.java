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

    // Starter method to show testing structure
    public static String generateDraftReport(List<Integer> scores) {
        return "Draft Report (student count: " + scores.size() + ", scores: " + scores + ")";
    }

    public static void main(String[] args) {
        // Generate initial draft
        String draft = generateDraftReport(SAMPLE_SCORES);
        System.out.println("Initial draft:\n" + draft + "\n");

    }
}
