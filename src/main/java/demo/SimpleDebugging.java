package demo;

/**
 * SimpleDebugging
 *
 * Focus: SIMPLE DEBUGGING with GitHub Copilot in IntelliJ.
 * Use Edit Mode
 */
public class SimpleDebugging {

  public static void main(String[] args) {
    // Use /explain to have Copilot describe the following function.
    // Then, use the /fix capability to fix the infinite loop.
    // To confirm the fix, use the /tests capability to generate a test.
    for (int i = 0; i < 10; i++) {
      for (int j = 9; j < 10; j--) {
        if (i + j == 10) {
          System.out.println("Found a pair: " + i + ", " + j);
        }
      }
    }

    // Ensure Copilot code completion is toggled on.
    // Enter below the next comment and watch as Copilot suggests code based on the comment alone.

    // List names with debug logs
  }
}
