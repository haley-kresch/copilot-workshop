package demo;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * FewShot
 *
 * Focus: FEW-SHOT PROMPTING with GitHub Copilot in IntelliJ.
 *
 * ➡️ Provide a few input-output examples to guide Copilot's behavior.
 * ➡️ Best Practices:
 *    - 2–5 representative examples
 *    - Consistent formatting
 *    - Avoid ambiguous or contradictory examples
 *
 * Students should experiment by supplying examples (few-shot)
 * and observe how Copilot generalizes new outputs.
 */
public class FewShot {

    /**
     * Example: Converting country codes to country names.
     *
     * FEW-SHOT EXAMPLES (Input → Output):
     *   "US" → "United States"
     *   "FR" → "France"
     *   "JP" → "Japan"
     *
     * TODO Exercise 1:
     * Prompt Copilot with just one vague example.
     * Example: "Add a method to map 'US' → 'United States'."
     * ➡️ Observe: Copilot may not generalize well.
     *
     * TODO Exercise 2:
     * Add 2–5 examples with consistent formatting.
     * Example: "Add a method that maps:
     *   'US' → 'United States'
     *   'FR' → 'France'
     *   'JP' → 'Japan'
     * Then extend the mapping for other codes."
     *
     * TODO Exercise 3:
     * Avoid contradictions.
     * Example: Don't include both "US → United States"
     * and "US → America" in the same set.
     */
    private static final Map<String, String> FEW_SHOT_EXAMPLES = new HashMap<String, String>() {{
        put("US", "United States");
        put("FR", "France");
        put("JP", "Japan");
    }};

    // TODO: Ask Copilot to generate a method based on the few-shot examples,
    // e.g., lookupCountryName(String code).

    public static void main(String[] args) {
        System.out.println("Few-shot examples: " + FEW_SHOT_EXAMPLES);

        // TODO: After generating the lookup method with Copilot, test it here.
        // Example (after generation):
        // System.out.println(lookupCountryName("US")); // United States
        // System.out.println(lookupCountryName("FR")); // France
        // System.out.println(lookupCountryName("DE")); // ?? (Copilot should guess or extend)
    }
}
