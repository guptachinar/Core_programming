import java.util.Scanner; 
public class DiscountFee { 
Scanner input 
= 
public static void main(String[] args) { 
new Scanner(System.in); System.out.print("Enter student fee: "); double fee = input.nextDouble(); 
System.out.print ("Enter discount percent: "); double discountPercent = input.nextDouble(); double discount = (discountPercent / 100) 
double finalFee = fee - discount; 
* fee; 
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee); 
} 
} 
