import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        // Input height in centimeters
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Display the BMI value
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determine weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
