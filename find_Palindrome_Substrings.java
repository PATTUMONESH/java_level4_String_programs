package level4_string_programs;

public class find_Palindrome_Substrings {
    public static void main(String[] args) {
        String inputString = "sas my pap";
        findPalindromeSubstrings(inputString);
    }

    public static void findPalindromeSubstrings(String str) {
        str = str.replaceAll("\\s+", ""); // Remove spaces
        int n = str.length();

        System.out.println("Palindrome substrings:");

        for (int center = 0; center < n; center++) {
            // Odd length palindromes
            int left = center;
            int right = center;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                System.out.println(str.substring(left, right + 1));
                left--;
                right++;
            }

            // Even length palindromes
            left = center;
            right = center + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                System.out.println(str.substring(left, right + 1));
                left--;
                right++;
            }
        }
    }
}
