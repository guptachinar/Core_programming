import java.util.Scanner;

public class negativesum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum (0 or negative number to stop):");

        while (true) {
            double number = input.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }

        System.out.println("Total sum: " + total);
    }
}
