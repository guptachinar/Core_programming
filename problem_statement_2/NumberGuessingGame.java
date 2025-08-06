import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String response;

        while (low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            response = sc.nextLine();

            if (response.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (response.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (response.equalsIgnoreCase("correct")) {
                System.out.println("Yay! Guessed it right.");
                break;
            } else {
                System.out.println("Invalid response.");
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
}
