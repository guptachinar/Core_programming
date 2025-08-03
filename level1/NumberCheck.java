import java.util.Scanner;

public class NumberCheck {
    public static int checkSign(int n) {
        if (n < 0) return -1;
        else if (n > 0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkSign(num);
        System.out.println("Result: " + result);
    }
}
