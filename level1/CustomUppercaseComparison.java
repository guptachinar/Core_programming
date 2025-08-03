import java.util.Scanner;

public class CustomUppercaseComparison {

    // Convert text to uppercase manually using ASCII logic
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String builtinUpper = input.toUpperCase();
        String customUpper = convertToUpper(input);

        System.out.println("Built-in toUpperCase: " + builtinUpper);
        System.out.println("Custom conversion:   " + customUpper);

        boolean isEqual = compareStrings(builtinUpper, customUpper);
        System.out.println("Are both uppercase versions equal? " + isEqual);

        scanner.close();
    }
}
