import java.util.*;

public class TeamHeightStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        int sum = getSum(heights);
        double mean = getMean(heights);
        int min = getShortest(heights);
        int max = getTallest(heights);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest Height: " + min);
        System.out.println("Tallest Height: " + max);
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }
}
