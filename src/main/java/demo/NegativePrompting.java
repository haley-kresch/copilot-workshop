package demo;

import java.util.Arrays;
import java.util.List;

/**
 * NegativePrompting
 *
 * Focus: NEGATIVE PROMPTING with GitHub Copilot in IntelliJ.
 *
 * ➡️ Specify what the model should avoid.
 * ➡️ Prevents unwanted styles, errors, or irrelevant output.
 * ➡️ Useful for code quality, documentation, and formatting.
 * ➡️ Works best when combined with positive guidance.
 */
public class NegativePrompting {

    // Example data for generating reports or documentation
    private static final List<Integer> SAMPLE_SCORES = Arrays.asList(88, 73, 95, 60, 77, 84);

    /**
     * TODO Exercise 1 (vague):
     * Prompt: "Add a method to generate a report from scores."
     * Observe: Copilot may include unwanted formatting, comments, or redundant info.
     */

    /**
     * TODO Exercise 2 (positive guidance):
     * Prompt: "Add a method generateReport(List<Integer> scores)
     *   - Include student count, average, min, and max
     *   - Format clearly for managers"
     */

    /**
     * TODO Exercise 3 (negative prompting):
     * Prompt: "Modify generateReport so it avoids:
     *   - Using abbreviations like 'avg' or 'cnt'
     *   - Printing unnecessary debug info
     *   - Including raw lists of scores unless requested
     *   - Adding redundant explanations"
     */

    /**
     * TODO Exercise 4 (combined prompting):
     * Prompt: "Generate documentation for the report method:
     *   - Use clear JavaDoc
     *   - Avoid verbose language and subjective opinions
     *   - Include only parameters and return value explanation"
     */

    // Starter draft method to show structure
    public static String generateReport(List<Integer> scores) {
        return "Report: Student count = " + scores.size() + ", Average = TBD, Min = TBD, Max = TBD";
    }

    public static void main(String[] args) {
        // Initial draft
        String draft = generateReport(SAMPLE_SCORES);
        System.out.println("Initial draft:\n" + draft + "\n");

        // Example feedback: negative prompting guidance
        List<String> negativeGuidance = Arrays.asList(
                "Avoid abbreviations like 'avg' or 'cnt'",
                "Do not include raw scores",
                "Avoid verbose explanations"
        );

        // TODO: Ask Copilot to implement refineReportWithNegativePrompt(String draft, List<String> guidance)
        System.out.println("Negative guidance (to refine draft): " + negativeGuidance);
        System.out.println("After implementing, run refineReportWithNegativePrompt(...) to apply restrictions.");
    }
}
