import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = getInput();
        System.out.println("Factorial: " + factorial(num));
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
