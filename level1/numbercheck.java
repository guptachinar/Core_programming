import java.util.Scanner; 
public class numbercheck { 
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Enter number: "); 
int num 
= 
sc.nextInt(); 
if (num > 0) 
System.out.println("The number is positive."); else if (num < 0) 
else 
System.out.println("The number is negative."); 
System.out.println("The number is zero."); 
} 
} 
