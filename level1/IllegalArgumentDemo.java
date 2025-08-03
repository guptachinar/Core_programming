import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Intentionally use invalid substring range to trigger the exception
        System.out.println("Generating IllegalArgumentException by using substring with invalid indexes...");
        String result = input.substring(5, 3);  // start > end: will throw IllegalArgumentException
        System.out.println("Substring: " + result); // This line won't be executed
    }

    // Method to handle the exception using try-catch
    public static void handleException(String input) {
        try {
            System.out.println("Handling IllegalArgumentException using try-catch...");
            String result = input.substring(5, 3);  // start > end: invalid
            System.out.println("Substring: " + result); // Not reached
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call method that generates the exception
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        // Call method that handles the exception
        handleException(userInput);

        scanner.close();
    }
}
