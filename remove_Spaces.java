package level4_string_programs;

public class remove_Spaces {
    public static void main(String[] args) {
        String inputString = "This is a test string with spaces";
        String stringWithoutSpaces = removeSpaces(inputString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}
