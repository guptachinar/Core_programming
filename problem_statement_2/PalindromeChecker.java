import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end)
            if (str.charAt(start++) != str.charAt(end--)) return false;
        return true;
    }
}
