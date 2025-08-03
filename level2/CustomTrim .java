public class CustomTrim {
    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[] { start, end };
    }

    public static String substring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) result += s.charAt(i);
        return result;
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine();
        int[] range = trimIndexes(input);
        String custom = substring(input, range[0], range[1]);
        String builtIn = input.trim();
        System.out.println("Custom trimmed: [" + custom + "]");
        System.out.println("Built-in trimmed: [" + builtIn + "]");
        System.out.println("Equal? " + compare(custom, builtIn));
    }
}
