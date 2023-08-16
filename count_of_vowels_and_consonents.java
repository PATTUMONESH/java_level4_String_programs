package level4_string_programs;

public class count_of_vowels_and_consonents {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int vowelCount = countVowels(inputString);
        int consonantCount = countConsonants(inputString);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' && !isVowel(c)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
