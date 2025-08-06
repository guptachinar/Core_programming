public class LexicographicalComparison {
    public static String compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) return s1 + " comes before " + s2;
            else if (s1.charAt(i) > s2.charAt(i)) return s2 + " comes before " + s1;
        }
        if (s1.length() < s2.length()) return s1 + " comes before " + s2;
        else if (s1.length() > s2.length()) return s2 + " comes before " + s1;
        else return "Both strings are equal";
    }
}
