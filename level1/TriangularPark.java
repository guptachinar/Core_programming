import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (5000 / perimeter);  // converting 5 km to meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("Rounds needed to complete 5 km run: " + Math.ceil(rounds));
    }
}
