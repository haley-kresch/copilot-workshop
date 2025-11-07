Follow the exercises below by prompting Copilot in Agent mode.

Suggested exercises
-------------------

1. Implement multiplication
   - Ask Copilot Agent to implement `multiply(int a, int b)` in
     `agent.CopilotAgentFoundation` so it correctly returns the product.

2. Add tests
   - Ask Copilot Agent to add JUnit tests under `src/test/java/agent/` for
     `add`, `multiply`, and `divide` (include a division-by-zero test).

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


