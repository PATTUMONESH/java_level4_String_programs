package level4_string_programs;

public class countsubstrings {
    public static void main(String[] args) {
        String inputString = "this is my bag";
        int substringCount = countSubstrings(inputString);
        System.out.println("Number of substrings: " + substringCount);
    }

    public static int countSubstrings(String str) {
        String[] words = str.split("\\s+");
        int totalCount = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                totalCount++;
            }
        }

        return totalCount;
    }
}
