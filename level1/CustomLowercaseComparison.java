import java.util.Scanner;

public class CustomLowercaseComparison {

    // Convert text to lowercase manually using ASCII logic
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // Convert to lowercase
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

        String builtinLower = input.toLowerCase();
        String customLower = convertToLower(input);

        System.out.println("Built-in toLowerCase: " + builtinLower);
        System.out.println("Custom conversion:    " + customLower);

        boolean isEqual = compareStrings(builtinLower, customLower);
        System.out.println("Are both lowercase versions equal? " + isEqual);

        scanner.close();
    }
}
