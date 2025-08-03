public class CharFrequency {
    public static int[][] getFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int[][] result = new int[256][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        int[][] output = new int[index][2];
        for (int i = 0; i < index; i++) output[i] = result[i];
        return output;
    }

    public static void main(String[] args) {
        String input = "banana";
        int[][] freq = getFrequency(input);
        System.out.println("Character frequencies:");
        for (int[] pair : freq) {
            System.out.println((char) pair[0] + ": " + pair[1]);
        }
    }
}
