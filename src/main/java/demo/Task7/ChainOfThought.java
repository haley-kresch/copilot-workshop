package demo.Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ChainOfThought
 */
public class ChainOfThought {

    // Example starter method to show testing format
    public static void demoSteps() {
        System.out.println("Step 1: Start with a simple example");
        System.out.println("Step 2: Show reasoning explicitly");
        System.out.println("Summary: Demo complete!");
    }

    /**
     * Combine two strings by concatenation.
     */
    public static String combineStrings(String a, String b) {
        if (a == null) a = "";
        if (b == null) b = "";
        return a + b;
    }

    /**
     * Return the reverse of the input string.
     */
    public static String reverseString(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Check if the input is a palindrome (ignore non-alphanumerics and case).
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    /**
     * Count words in a string (splits on whitespace).
     */
    public static int countWords(String s) {
        if (s == null) return 0;
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }


    /**
     * Summarize an array of step strings into a numbered block.
     */
    public static String summarizeSteps(String[] steps) {
        if (steps == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < steps.length; i++) {
            sb.append("Step ").append(i + 1).append(": ").append(steps[i]);
            if (i < steps.length - 1) sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        demoSteps();

    }
}
