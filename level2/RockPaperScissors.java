import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        return new String[] { "rock", "paper", "scissors" }[n];
    }

    public static String getResult(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock")))
            return "User Wins";
        else return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, rounds;

        System.out.print("Enter number of rounds: ");
        rounds = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String result = getResult(user, computer);
            System.out.println("Computer: " + computer + " | Result: " + result);
            if (result.equals("User Wins")) userWins++;
            else if (result.equals("Computer Wins")) compWins++;
        }

        System.out.println("\nFinal Results:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + (rounds - userWins - compWins));
    }
}
