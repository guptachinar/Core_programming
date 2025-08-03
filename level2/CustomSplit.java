import java.util.Scanner;

public class CustomSplit {
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for (char c : text.toCharArray()) if (c == ' ') wordCount++;
        String[] words = new String[wordCount];
        int start = 0, idx = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[idx++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] builtIn = input.split(" ");
        String[] custom = splitWords(input);
        System.out.println("Are arrays equal? " + compare(builtIn, custom));
        sc.close();
    }
}
