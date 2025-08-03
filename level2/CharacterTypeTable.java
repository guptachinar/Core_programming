public class CharacterTypeTable {
    public static String getType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Char\tType");
        for (char ch : str.toCharArray())
            System.out.println(ch + "\t" + getType(ch));
    }
}
