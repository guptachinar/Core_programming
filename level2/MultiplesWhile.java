import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        int counter = 1;
        while (counter < 100) {
            if (counter % number == 0)
                System.out.println(counter);
            counter++;
        }
    }
}
