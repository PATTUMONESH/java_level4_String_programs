package level4_string_programs;

public class remove_Characters {
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        String charactersToRemove = "o,!";
        String stringWithoutChars = removeCharacters(inputString, charactersToRemove);
        System.out.println("String without specified characters: " + stringWithoutChars);
    }

    public static String removeCharacters(String str, String charactersToRemove) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (charactersToRemove.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
