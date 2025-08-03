public class StringLength {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Length: " + findLength(input));
    }
}
