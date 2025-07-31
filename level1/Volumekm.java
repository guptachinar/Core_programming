public class Volumekm { 
public static void main(String[] args) { 
double radius = 6378; // in km 
double volumeKm = (4.0/3)* Math. PI* Math.pow(radius, 3); 
double volumeMiles = volumeKm / Math.pow(1.6, 3); 
System.out.println("The volume of earth in cubic kilometers is " + volumekm 
+ )
and cubic miles is " + volumeMiles); 
} 
} 

