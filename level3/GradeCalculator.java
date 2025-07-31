import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for the three subjects
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();

        // Calculate the average percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averageMarks = totalMarks / 3.0;
        double percentage = (averageMarks / 100) * 100; // As a percentage

        // Determine the grade based on percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "(Level 1 -, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        // Output results
        System.out.printf("Average Marks: %.2f\n", averageMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close scanner
        scanner.close();
    }
}
