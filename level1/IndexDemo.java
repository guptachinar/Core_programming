import java.util.Scanner;

public class IndexDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Accessing index out of array bounds...");
        System.out.println("Name at index 10: " + names[10]); // Invalid index
    }

    // Method to handle the exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling ArrayIndexOutOfBoundsException using try-catch...");
            System.out.println("Name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        // Generate exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        // Handle exception
        handleException(names);

        scanner.close();
    }
}
