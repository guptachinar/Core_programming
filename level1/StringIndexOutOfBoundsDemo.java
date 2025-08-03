import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // This will throw an exception if index is out of bounds
        System.out.println("Accessing character at index " + input.length() + " (out of bounds)...");
        char ch = input.charAt(input.length()); // Invalid index
        System.out.println("Character: " + ch); // This line won't be executed
    }

    // Method to handle the exception using try-catch
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception using try-catch block...");
            char ch = input.charAt(input.length()); // Will throw exception
            System.out.println("Character: " + ch); // Not reached
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        // Call method that handles the exception
        handleException(userInput);

        scanner.close();
    }
}
