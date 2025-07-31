import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int i = 1, sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Results match? " + (sum == formulaSum));
        }
    }
}
