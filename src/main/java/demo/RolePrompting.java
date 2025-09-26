package demo;

import java.util.List;
import java.util.Arrays;


/**
 * RolePrompting
 *
 * Focus: ROLE PROMPTING with GitHub Copilot in IntelliJ.
 *
 * ➡️ Assigning Copilot a role improves tone, style, and relevance.
 * ➡️ Helps control domain focus and reduce irrelevant output.
 * ➡️ Useful for debugging, code review, documentation, and simulation.
 *
 * Students should experiment with role-based prompts and compare
 * Copilot’s behavior when roles are explicit vs. implicit.
 */
public class RolePrompting {

    private List<String> deploymentLogs;

    public RolePrompting(List<String> logs) {
        this.deploymentLogs = logs;
    }

    /**
     * TODO Exercise 1:
     * Vague prompt (no role given).
     * Example: "Add a method to check these logs."
     * ➡️ Observe: Copilot may give generic or unfocused output.
     */

    /**
     * TODO Exercise 2:
     * Add a ROLE prompt for more control.
     * Example: "You are a senior DevOps Engineer. Add a method named
     * findErrors(List<String> logs) that:
     *   - Scans logs for lines containing 'ERROR'
     *   - Returns them as a List<String>
     *   - Handles null/empty lists gracefully"
     */

    /**
     * TODO Exercise 3:
     * Explore other roles and tasks:
     * - "You are a Java code reviewer. Suggest improvements for readability."
     * - "You are a technical writer. Document this method with clear JavaDoc."
     * - "You are a security engineer. Review this code for vulnerabilities."
     *
     * Compare tone, style, and domain-specific relevance in each case.
     */

    public static void main(String[] args) {
        RolePrompting roleDemo = new RolePrompting(
                Arrays.asList("INFO: Deployment started",
                        "ERROR: Database connection failed",
                        "INFO: Retrying..."));

        // TODO: After generating role-based methods with Copilot,
        // call them here and inspect the outputs.
    }
}

