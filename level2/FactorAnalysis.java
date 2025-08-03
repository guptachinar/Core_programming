import java.util.*;

public class FactorAnalysis {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        return sum;
    }

    public static int getProduct(int[] arr) {
        int product = 1;
        for (int a : arr) product *= a;
        return product;
    }

    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int a : arr) sum += Math.pow(a, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + getSum(factors));
        System.out.println("Product: " + getProduct(factors));
        System.out.println("Sum of Squares: " + getSumOfSquares(factors));
    }
}
