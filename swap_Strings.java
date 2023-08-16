package level4_string_programs;

public class swap_Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        swapStrings(str1, str2);

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

    public static void swapStrings(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }
}
