public class UniqueFrequency {
    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = current;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static String[][] frequencyFromUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "aabbccddaa";
        String[][] result = frequencyFromUnique(input);
        System.out.println("Frequencies:");
        for (String[] pair : result)
            System.out.println(pair[0] + ": " + pair[1]);
    }
}
