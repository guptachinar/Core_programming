public class WordLength2DArray {
    public static int findLength(String str) {
        int count = 0;
        try { while (true) str.charAt(count++); } catch (Exception e) {}
        return count;
    }

    public static String[][] wordWithLength(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine();
        String[][] output = wordWithLength(input);
        for (String[] row : output) System.out.println(row[0] + " -> " + row[1]);
    }
}
