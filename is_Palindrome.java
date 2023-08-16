package level4_string_programs;

public class is_Palindrome {
    public static void main(String[] args) {
        String inputString = "madam";
        boolean isPalindrome = isPalindrome(inputString);
        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }
}
