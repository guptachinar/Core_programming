import java.util.Scanner;

public class multiplication table of a number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an integer array to store results from 1 to 10
        int[] table = new int[10];

        // Run a loop from 1 to 10 and store the results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the result from the array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        scanner.close();
    }
}