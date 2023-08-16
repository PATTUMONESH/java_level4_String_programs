package level4_string_programs;

import java.util.HashMap;
import java.util.Map;

public class print_duplicate_characters {
    public static void main(String[] args) {
        String inputString = "madam";
        printDuplicateCharacters(inputString);
    }

    public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

