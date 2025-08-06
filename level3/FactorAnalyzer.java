public class FactorAnalyzer {

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[idx++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) if (f < 9999) max = Math.max(max, f);
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static double productCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static boolean isPerfect(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != num) sum += f;
        return sum == num;
    }

    public static boolean isAbundant(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != num) sum += f;
        return sum > num;
    }

    public static boolean isDeficient(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != num) sum += f;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return sum == original;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
