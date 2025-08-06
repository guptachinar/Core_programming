public class Analyzer {

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d * d;
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    public static void digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int d : digits) freq[d][1]++;

        for (int[] pair : freq) {
            if (pair[1] > 0)
                System.out.println("Digit: " + pair[0] + ", Frequency: " + pair[1]);
        }
    }
}
