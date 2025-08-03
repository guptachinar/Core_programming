public class PalindromeIterative {
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome? " + isPalindrome(input));
    }
}
