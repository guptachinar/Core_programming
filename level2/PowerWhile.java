import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1, counter = 0;

        while (counter < power) {
            result *= base;
            counter++;
        }

        System.out.println(base + " raised to " + power + " is " + result);
    }
}
