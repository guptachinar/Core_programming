import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: rows = students, columns = subjects (0=Physics, 1=Chemistry, 2=Maths)
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Output results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }

        sc.close();
    }
}