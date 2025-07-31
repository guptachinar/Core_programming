import java.util.Scanner; 
public class TriangleArea { 
public static void main(String[] args) { 
Scanner input 
= 
new Scanner(System.in); 
System.out.print ("Enter base in inches: "); 
double base = input.nextDouble(); 
System.out.print ("Enter height in inches: "); 
double height 
= 
input.nextDouble(); 
double areaInInches = 0.5 * base* height; 
double area InCm = areaInInches * 6.4516; 
"I 
System.out.println("Area in square inches: " + areaInInches + Area in 
square 
cm: " + areaInCm); 
} 
} 
