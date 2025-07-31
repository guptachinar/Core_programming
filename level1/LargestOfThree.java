import java.util.Scanner; 
public class LargestOfThree { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter number1: "); 
		int number1 = sc.nextInt(); 
		System.out.print("Enter number2: "); 
		int number2 = sc.nextInt(); 
		System.out.print("Enter number3: "); 
		int number3 = sc.nextInt(); 
		boolean first = number1 > number2 && number1 > number3; 
		boolean second = number2 > number1 && number2 > number3; 
		boolean third = number3 > number1 && number3 > number2; 
		System.out.println("Is the first number the largest? " + first); 
		System.out.println("Is the second number the largest? " + second); 
		System.out.println("Is the third number the largest? " + third); 
	} 
}

