public class ShortestLongestWord {
    public static String[] find(String[][] wordLength) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String shortest = "", longest = "";
        for (String[] row : wordLength) {
            int len = Integer.parseInt(row[1]);
            if (len < min) { min = len; shortest = row[0]; }
            if (len > max) { max = len; longest = row[0]; }
        }
        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(words[i].length());
        }
        String[] result = find(data);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
