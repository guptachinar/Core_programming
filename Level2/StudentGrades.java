import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for the number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays to store marks, percentages, and grades
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input of marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));

            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");

            // d. Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // e. Assign grade based on percentage
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'F';
        }

        // f. Display the results
        System.out.println("\nStudent Report:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }

    // Method to validate marks input
    private static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks: ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid marks. Please enter between 0 and 100.");
            }
        }
        return marks;
    }
}
