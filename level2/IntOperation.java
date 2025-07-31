import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        int op1 = a + b + c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int Operations are:");
        System.out.println("op1 = " + op1);
        System.out.println("op2 = " + op2);
        System.out.println("op3 = " + op3);
        System.out.println("op4 = " + op4);

        input.close();
    }
}
