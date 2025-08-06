public class NumberProperties {

    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] rev = reverseArray(digits);
        return java.util.Arrays.equals(digits, rev);
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        return java.util.Arrays.equals(a, b);
    }
}
