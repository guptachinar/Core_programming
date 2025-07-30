import java.util.Scanner;

public class frequencyofeachdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = sc.nextLine();
        int len = numStr.length();

        int[] digits = new int[len];
        int[] freq = new int[10];

        // Store each digit in the digits array
        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Count frequency of each digit
        for (int i = 0; i < len; i++) {
            if (digits[i] >= 0 && digits[i] <= 9) {
                freq[digits[i]]++;
            }
        }

        // Display the frequency of each digit
        System.out.println("Digit : Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " : " + freq[i]);
            }
        }
        sc.close();
    }
}