import java.util.Random;

public class StudentScoreCard {

    // Method to generate random scores
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [students][Physics, Chemistry, Math]
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Random 2-digit scores (60 to 100)
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculatePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0; // rounded to 2 decimal places
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to assign grades based on percentage
    public static char[] assignGrades(double[][] percentages) {
        int numStudents = percentages.length;
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Method to print scorecard
    public static void printScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Percent", "Grade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10c\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int numStudents = 5;

        int[][] scores = generateScores(numStudents);
        double[][] results = calculatePercentage(scores);
        char[] grades = assignGrades(results);
        printScorecard(scores, results, grades);
    }
}
