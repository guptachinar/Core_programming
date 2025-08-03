import java.util.Scanner;

public class numberofrounds {

    // Method to calculate the number of rounds needed to complete 5 km run
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // perimeter in meters
        double distance = 5000.0; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        scanner.close();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }
}
