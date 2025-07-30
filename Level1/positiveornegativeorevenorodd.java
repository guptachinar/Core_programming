import java.util.Scanner;

public class positiveornegativeorevenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number at index " + i + " (" + num + "): ");
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("Comparison of first and last element: ");
        if (first == last) {
            System.out.println("Equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}