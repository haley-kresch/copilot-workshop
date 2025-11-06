package agent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Copilot Agent Foundation
 *
 * A small, well-scoped Java class intended as a foundation for an interactive
 * training exercise showing GitHub Copilot's Agent mode. Trainees will ask
 * Copilot to add files, implement TODOs, generate tests, and run commands.
 */
public class CopilotAgentFoundation {

  /**
   * Simple addition helper (already implemented).
   */
  public static int add(int a, int b) {
    return a + b;
  }

  /**
   * Multiplication helper — intentionally left unimplemented.
   * Have Copilot implement this and add tests to validate.
   */
  public static int multiply(int a, int b) {
    throw new UnsupportedOperationException("multiply not implemented");
  }

  /**
   * Division helper with simple validation (implemented so tests can also
   * exercise an implemented method).
   */
  public static double divide(int a, int b) {
    if (b == 0) throw new IllegalArgumentException("division by zero");
    return (double) a / b;
  }

  /**
   * Utility that writes a string to a file. Useful so Copilot Agents can be
   * asked to create CLI tools that emit files and to validate file IO in tests.
   */
  public static void writeOutput(String filename, String content) throws IOException {
    Path p = Paths.get(filename);
    Path parent = p.getParent();
    if (parent != null) {
      Files.createDirectories(parent);
    }
    // Use Files.write with a byte[] and explicit UTF-8 to ensure compatibility
    Files.write(p, content.getBytes(java.nio.charset.StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
  }

  public static void main(String[] args) {
    System.out.println("Copilot Agent Foundation ready. See README in this package for interactive tasks.");
  }
}
