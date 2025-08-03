import java.util.Scanner;

public class BMICalculator {

    // Method to take input for weight and height
    public static double[][] takeInput(int numPeople) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[numPeople][2]; // [weight, height]
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (in kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (in cm): ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] inputData) {
        int n = inputData.length;
        String[][] result = new String[n][4]; // height, weight, BMI, status

        for (int i = 0; i < n; i++) {
            double weight = inputData[i][0];
            double heightCm = inputData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 29.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.format("%.2f", heightCm); // height
            result[i][1] = String.format("%.2f", weight);    // weight
            result[i][2] = String.format("%.2f", bmi);       // BMI
            result[i][3] = status;                           // Status
        }
        return result;
    }

    // Method to print data in tabular format
    public static void displayData(String[][] result) {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int numPeople = 10;

        double[][] inputData = takeInput(numPeople);
        String[][] result = calculateBMI(inputData);
        displayData(result);
    }
}
