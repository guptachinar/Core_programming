import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Custom length: " + findLength(input));
        System.out.println("Built-in length: " + input.length());
        sc.close();
    }
}
