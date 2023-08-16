package level4_string_programs;

public class find_Longest_Substring {
    public static void main(String[] args) {
        String inputString = "monemonemonesmo";
        String longestSubstring = findLongestSubstring(inputString);
        System.out.println("Longest substring: " + longestSubstring);
    }

    public static String findLongestSubstring(String str) {
        int n = str.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int left = 0;

        // Create a character frequency array to track occurrences
        int[] charFrequency = new int[128]; // Assuming ASCII characters

        while (end < n) {
            char endChar = str.charAt(end);
            charFrequency[endChar]++;

            while (charFrequency[endChar] > 1) {
                char startChar = str.charAt(start);
                charFrequency[startChar]--;
                start++;
            }

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                left = start;
            }

            end++;
        }

        return str.substring(left, left + maxLength);
    }
}
