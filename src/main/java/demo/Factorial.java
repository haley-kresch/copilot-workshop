package demo;

public class Factorial {
    // Buggy implementation for demo purposes
    public static int factorial(int n) {
        if (n == 0) {
            return 0; // BUG: should return 1
        } else {
            return n * factorial(n - 1);
        }
    }

    // Task: Ask Copilot to find and fix the bug using chain-of-thought prompting
}
