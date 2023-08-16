package level4_string_programs;

public class replace_Character {
    public static void main(String[] args) {
        String originalString = "delhi";
        char oldChar = 'e';
        char newChar = 'a';

        String modifiedString = replaceCharacter(originalString, oldChar, newChar);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }
}
