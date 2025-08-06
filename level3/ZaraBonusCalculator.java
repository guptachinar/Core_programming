import java.util.Random;

public class ZaraBonusCalculator {
    static final int EMPLOYEES = 10;

    // Method to generate salary and years of service using random
    public static int[][] generateSalaryAndService() {
        int[][] employeeData = new int[EMPLOYEES][2]; // [][0] = salary, [][1] = years of service
        Random rand = new Random();

        for (int i = 0; i < EMPLOYEES; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary
            employeeData[i][1] = rand.nextInt(11); // years of service from 0 to 10
        }

        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] updatedData = new double[EMPLOYEES][2]; // [][0] = new salary, [][1] = bonus

        for (int i = 0; i < EMPLOYEES; i++) {
            int salary = data[i][0];
            int service = data[i][1];
            double bonus = (service > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }

        return updatedData;
    }

    // Method to calculate totals and display in tabular format
    public static void displayResults(int[][] originalData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-15s %-12s %-15s\n", 
            "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEES; i++) {
            int oldSalary = originalData[i][0];
            int years = originalData[i][1];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-15d %-12.2f %-15.2f\n", 
                i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-15s %-12.2f %-15.2f\n", 
            "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateSalaryAndService();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
}
