package demo;

import java.util.List;

/**
 * Clarity
 *
 * This class is designed for practicing prompt engineering skills
 * (Clarity & Specificity) with GitHub Copilot in IntelliJ.
 *
 * ➡️ Clarity = Unambiguous instructions
 * ➡️ Specificity = Context + Format + Constraints
 *
 * Think of your prompts as API specifications:
 * - Precise inputs → Predictable outputs
 */
public class Clarity {

    private String studentName;

    public Clarity(String studentName) {
        this.studentName = studentName;
    }

    public void greet() {
        System.out.println("Hello, " + studentName + "!");
    }

    /**
     * TODO Exercise 1:
     * Give Copilot a vague prompt and observe results.
     * Example: "Add a method that works with numbers."
     */

    /**
     * TODO Exercise 2:
     * Refine the same idea with clarity.
     * Example: "Add a method that takes a list of integers
     * and returns the sum as an int."
     */

    /**
     * TODO Exercise 3:
     * Now add specificity (context, format, constraints).
     * Example: "Add a static method named calculateAverage(List<Integer> numbers)
     * that:
     *   - Returns 0.0 if the list is null or empty
     *   - Uses Java Streams for the calculation
     *   - Includes JavaDoc with @param and @return tags
     *   - Has no side effects"
     */

    public static void main(String[] args) {
        Clarity test = new Clarity("Student");
        test.greet();

        // After generating new methods with Copilot,
        // call and test them here with sample inputs.
    }
}
