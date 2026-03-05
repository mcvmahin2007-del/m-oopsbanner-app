import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Uses HashMap to store and retrieve character patterns.
 */
public class uc8{

    /**
     * Utility method to create and return the pattern map
     * @return Map containing character patterns
     */
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        });

        patternMap.put('S', new String[]{
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        });

        return patternMap;
    }

    /**
     * Utility method to print banner message
     * @param message Word to display
     * @param patternMap Map containing patterns
     */
    public static void printBanner(String message, Map<Character, String[]> patternMap) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : message.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("   ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String message = "OOPS";

        printBanner(message, patternMap);
    }
}