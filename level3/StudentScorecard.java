import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // Physics, Chemistry, Math
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 51) + 50; // Physics 50–100
            scores[i][1] = (int) (Math.random() * 51) + 50; // Chemistry 50–100
            scores[i][2] = (int) (Math.random() * 51) + 50; // Math 50–100
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to get grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    // Method to print the result in tabular format
    public static void printScorecard(int[][] scores, double[][] stats) {
        System.out.println("SNo\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int) stats[i][0] + "\t");
            System.out.print(stats[i][1] + "\t");
            System.out.print(stats[i][2] + "%\t\t");
            System.out.println(getGrade(stats[i][2]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);

        printScorecard(scores, stats);
    }
}
