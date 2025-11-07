package demo.Task3;

import java.util.Map;
import java.util.HashMap;

/**
 * FewShot
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
