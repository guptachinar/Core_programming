import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
        }

        // d. Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // f. Determine status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\nResults:");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                (i + 1), height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
