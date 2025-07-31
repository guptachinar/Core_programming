import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int originalNumber = number;

        if (number == 0) {
            count = 1; // 0 has 1 digit
        } else {
            while (number != 0) {
                number /= 10;  // remove last digit
                count++;       // increase count
            }
        }

        System.out.println("Number of digits in " + originalNumber + " is: " + count);
    }
}
