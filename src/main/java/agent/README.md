Copilot Agent Foundation - Trainer instructions
==============================================

Overview
--------

This package contains a small Java class, `CopilotAgentFoundation`, designed as a
foundation for an interactive Copilot Agent training activity. The goal is to
show how Copilot's Agent mode can:

- Add new files to the project
- Implement missing functionality
- Generate unit tests
- Run commands in the terminal (e.g. build or test)

What you (the trainee) should do
--------------------------------

Follow the exercises below by prompting Copilot in Agent mode. You should not
start from scratch — use the existing `CopilotAgentFoundation` class as the
foundation for each task.

Suggested exercises
-------------------

1. Implement multiplication
   - Ask Copilot Agent to implement `multiply(int a, int b)` in
     `agent.CopilotAgentFoundation` so it correctly returns the product.
   - Example prompt: "Implement the multiply method in agent.CopilotAgentFoundation
     and add unit tests that verify it with positive, negative, and zero values."

2. Add tests
   - Ask Copilot Agent to add JUnit tests under `src/test/java/agent/` for
     `add`, `multiply`, and `divide` (include a division-by-zero test).
   - Example prompt: "Create a JUnit 5 test class agent.CopilotAgentFoundationTest
     that covers add, multiply, and divide (including division-by-zero)."

3. Create a small CLI or helper class
   - Ask Copilot Agent to add a new file `agent/AdvancedCalculator.java` that
     exposes the basic operations and a `main` method which accepts command-line
     arguments and writes results to a file using
     `CopilotAgentFoundation.writeOutput`.
   - Example prompt: "Create agent.AdvancedCalculator with methods add, multiply,
     divide and a CLI 'main' that accepts operation and two numbers and writes
     the output to ./tmp/result.txt. Add tests for the CLI's helper methods."

4. Run commands
   - Once tests are generated, ask the Agent to run the project's tests.
   - In this workspace you can run tests from Windows cmd with:

     gradlew.bat test

   - Example prompt: "Run Gradle tests (gradlew.bat test) and report failures. If
     tests fail, iteratively fix the code or tests until they pass."

5. Experiment with other agent features
   - Refactor code (rename methods, extract classes).
   - Add logging or extra validation.
   - Ask Copilot to create small README or documentation files describing the
     new features it adds.

Feedback exercise (optional)
----------------------------

Ask the Agent to create a short report file `agent/AGENT_RUN_REPORT.md` that
summarizes what it changed and why (this is a good way to practice reviewing
agent work).


