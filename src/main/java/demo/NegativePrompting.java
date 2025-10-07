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

    // Starter draft method to show structure
    public static String generateReport(List<Integer> scores) {
        return "Report: Student count = " + scores.size() + ", Average = TBD, Min = TBD, Max = TBD";
    }

    public static void main(String[] args) {
        // Initial draft
        String draft = generateReport(SAMPLE_SCORES);
        System.out.println("Initial draft:\n" + draft + "\n");

    }
}
