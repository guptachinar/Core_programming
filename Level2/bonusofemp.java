import java.util.Scanner;

public class bonusofemp {
    public static void main(String[] args) {
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        // Input salaries and years of service
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years >= 0. Please re-enter.");
                i--; // Decrement index to repeat input
                continue;
            }
            salary[i] = sal;
            years[i] = yrs;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\nEmployee\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t\t%.2f\n", 
                (i + 1), salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}