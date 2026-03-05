/**
 * OOPS Banner App - UC7
 * Displays the word OOPS using stored character patterns.
 */
public class uc7 {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character banner character
         * @param pattern 7 line pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns stored character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] map, char ch) {

        for (CharacterPatternMap cp : map) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(CharacterPatternMap[] map, String text) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : text.toCharArray()) {

            String[] pattern = getCharacterPattern(map, ch);

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

        String[] O = {
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        };

        String[] P = {
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        };

        String[] S = {
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        };

        CharacterPatternMap[] patternMap = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner(patternMap, "OOPS");
    }
}