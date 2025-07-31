import java.util.Scanner; 
public class Calculator { 
public static void main(String[] args) { 
Scanner input 
= 
new Scanner(System.in); 
System.out.print ("Enter number1: "); 
double num1 = input.nextDouble(); 
System.out.print("Enter number2: "); 
double num2 = input.nextDouble(); 
System.out.println("Addition: " + (num1 + num2)); 
System.out.println("Subtraction: 
+ (num1 - num2)); 
"I 
System.out.println("Multiplication: + (num1 * num2)); 
System.out.println("Division: + (num1 / num2)); 
} 
} 
