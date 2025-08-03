import java.util.Scanner;

public class numberofhandshakes {

    // Method to calculate maximum number of handshakes
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.close();

        int maxHandshakes = maxHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
    }
}
