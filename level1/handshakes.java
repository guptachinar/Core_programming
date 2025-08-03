import java.util.Scanner;

public class handshakes {

    // Method to calculate maximum number of handshakes
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = maxHandshakes(n);
        System.out.println("Maximum number of handshakes among " + n + " students is: " + result);
    }
}
