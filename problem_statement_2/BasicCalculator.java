import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: 1-Add 2-Sub 3-Mul 4-Div");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + subtract(a, b));
            case 3 -> System.out.println("Result: " + multiply(a, b));
            case 4 -> System.out.println("Result: " + divide(a, b));
            default -> System.out.println("Invalid choice");
        }
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return y != 0 ? x / y : Double.NaN;
    }
}
