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

    private static final Map<String, String> FEW_SHOT_EXAMPLES = new HashMap<String, String>() {{
        put("US", "United States");
        put("FR", "France");
        put("JP", "Japan");
    }};

    public static void main(String[] args) {
        System.out.println("Few-shot examples: " + FEW_SHOT_EXAMPLES);

    }
}
