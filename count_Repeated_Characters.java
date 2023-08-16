package level4_string_programs;

import java.util.HashMap;
import java.util.Map;

public class count_Repeated_Characters {
    public static void main(String[] args) {
        String inputString = "programming";
        countRepeatedCharacters(inputString);
    }

    public static void countRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters with count > 1
        System.out.println("Repeated characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
