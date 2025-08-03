import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int totalChocolates, int children) {
        return new int[]{totalChocolates % children, totalChocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt(), kids = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, kids);
        System.out.println("Each child gets: " + result[1] + ", Remaining chocolates: " + result[0]);
    }
}
