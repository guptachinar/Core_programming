import java.util.Scanner;

public class LineEquationDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display distance
        double distance = getEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.3f\n", distance);

        // Calculate and display line equation
        double[] line = getLineEquation(x1, y1, x2, y2);
        if (line != null) {
            double m = line[0];
            double b = line[1];
            System.out.printf("Equation of the line: y = %.3fx + %.3f\n", m, b);
        } else {
            System.out.println("The line is vertical. Equation: x = " + x1);
        }
    }

    // Method to calculate Euclidean distance
    public static double getEuclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow((x2 - x1), 2);
        double dy = Math.pow((y2 - y1), 2);
        return Math.sqrt(dx + dy);
    }

    // Method to get slope and y-intercept: returns [m, b]
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return null; // Vertical line case (undefined slope)
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
