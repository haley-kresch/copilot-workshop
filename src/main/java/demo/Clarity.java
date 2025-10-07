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

    public static void main(String[] args) {
        Clarity test = new Clarity("Student");
        test.greet();
    }
}
