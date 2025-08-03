public class VowelConsonantCount {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static int[] countVC(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine();
        int[] res = countVC(input);
        System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
    }
}
