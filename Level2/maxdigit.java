import java.util.Scanner;

public class maxdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Initial maxDigit size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        long tempNum = num;
        // Extract digits and store in array, resizing if needed
        while (tempNum > 0) {
            if (index == maxDigit) {
                // Increase maxDigit by 10 and copy to new array
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = (int)(tempNum % 10);
            tempNum /= 10;
        }

        // Create an array to store digits in reverse order
        int[] reversed = new int[index];
        for (int i = 0; i < index; i++) {
            reversed[i] = digits[index - 1 - i];
        }

        // Display the reversed array
        System.out.print("Reversed number: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        // Find largest and second largest digit
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));
    }
}