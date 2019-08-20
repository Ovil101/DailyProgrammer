/**
 * @author Ryan Lioy
 * @version 8/9/2019, rewrote 8/20/19
 * @see https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
 */
package challenge380;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Challenge380Easy {
    private static final String[][] CONVERSION_ARRAY = {{"a", ".-"}, {"b", "-..."},
            {"c", "-.-."}, {"d", "-.."},
            {"e", "."}, {"f", "..-."},
            {"g", "--."}, {"h", "...."},
            {"i", ".."}, {"j", ".---"},
            {"k", "-.-."}, {"l", ".-.."},
            {"m", "--"}, {"n", "-."},
            {"o", "---"}, {"p", ".--."},
            {"q", "--.-"}, {"r", ".-."},
            {"s", "..."}, {"t", "-"},
            {"u", "..-"}, {"v", "...-"},
            {"w", ".--"}, {"x", "-..-"},
            {"y", "-.--"}, {"z", "--.."}};

    public static void main(String[] args) {
        String[] tests = {"sos", "daily", "programmer", "bits", "three"};
        for (String s : tests) {
            System.out.println(englishToMorse(s));
        }
    }

    public static String englishToMorse(String english) {
        String morse = "";
        HashMap<String, String> CONVERSION = createConversion();

        char[] split = english.toLowerCase().toCharArray();
        for (char c : split) {
            Iterator iterate = CONVERSION.entrySet().iterator();
            while (iterate.hasNext()) {
                Map.Entry item = (Map.Entry) iterate.next();
                String s = (String) item.getValue();
                if (item.getKey().equals(Character.toString(c))) {
                    morse += s;
                }
            }
        }
        return morse;
    }

    public static HashMap<String, String> createConversion() {
        // I kept CONVERSION_ARRAY because doing this was
        // easier than writing 26 put() statements which
        // is not something I want to do
        HashMap<String, String> map = new HashMap<>(26);
        for (String[] array : CONVERSION_ARRAY) {
            map.put(array[0], array[1]);
        }
        return map;
    }
}
