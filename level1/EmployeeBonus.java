import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("You get a bonus of: ₹" + bonus);
        } else {
            System.out.println("No bonus. Service must be more than 5 years.");
        }
    }
}
