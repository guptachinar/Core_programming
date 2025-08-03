import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];           // in kg
            double heightCm = data[i][1];         // in cm
            double heightM = heightCm / 100.0;     // convert to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;                     // Store BMI
        }
    }

    // Method to determine BMI status based on value
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    // Main method to execute program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // [weight, height, bmi]

        // Input weights and heights
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI status
        String[] bmiStatuses = getBMIStatus(data);

        // Display results
        System.out.println("\nResult:");
        System.out.printf("%-10s%-12s%-10s%-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-12.2f%-10.2f%-15s\n", i + 1, data[i][0], data[i][1], bmiStatuses[i]);
        }
    }
}
