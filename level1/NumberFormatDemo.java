import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException by trying to parse a non-numeric string...");
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not numeric
        System.out.println("Parsed number: " + number); // This line won't be executed if exception occurs
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Handling NumberFormatException using try-catch...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
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
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        // Call method that handles the exception
        handleException(userInput);

        scanner.close();
    }
}
