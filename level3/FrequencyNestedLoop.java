public class FrequencyNestedLoop {
    public static String[] getFrequencies(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        String[] output = new String[index];
        System.arraycopy(result, 0, output, 0, index);
        return output;
    }

    public static void main(String[] args) {
        String input = "success";
        String[] freq = getFrequencies(input);
        for (String s : freq) System.out.println(s);
    }
}
