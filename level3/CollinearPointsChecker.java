import java.util.Scanner;

public class CollinearPointsChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Coordinates of 3 points
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope method
        boolean slopeCollinear = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Using Slope Method: " + (slopeCollinear ? "Collinear" : "Not Collinear"));

        // Check using area of triangle method
        boolean areaCollinear = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Using Area Method: " + (areaCollinear ? "Collinear" : "Not Collinear"));
    }

    // Method 1: Slope formula
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero using cross multiplication
        int lhs = (y2 - y1) * (x3 - x2);
        int rhs = (y3 - y2) * (x2 - x1);
        return lhs == rhs;
    }

    // Method 2: Area of triangle
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area = 0.5 * [x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)]
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}
