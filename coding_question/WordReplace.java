public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) result.append(newWord);
            else result.append(word);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
