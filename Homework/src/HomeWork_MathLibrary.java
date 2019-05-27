import java.lang.Math;
import java.util.Random; 

public class HomeWork_MathLibrary {
	public static void main(String[] args) {
		
		double a = 56.34, b = 6.58334, c = -34.4265;

		double pie = Math.PI; 
		System.out.println("The value of Pi is: "+pie);
		double exponential = Math.E; 
		System.out.println("The value of e  is: "+exponential);
		Random rand = new Random();
		
		// Generate random Integers
        int rand_integer = rand.nextInt();  
        // Generate Random Doubles 
        double rand_double = rand.nextDouble(); 
        
        // Print random Integers and random Doubles
        System.out.println("Random Integers: "+rand_integer);  
        System.out.println("Random Doubles : "+rand_double); 
        
        double absolutevalueofc = Math.abs(c); 
        double sqaurerootofa = Math.sqrt(a);
        double maxvalue = Math.max(a,b);
        double power = Math.pow(a,b);
        double roundofa = Math.round(a);
        double root = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double floorofb = Math.floor(b);
        double floorofc = Math.floor(c);
        double ceilofb = Math.ceil(b);
        double ceilofc = Math.ceil(c);
        double roundofb = Math.round(b);
        double roundofc = Math.round(c);
        double rad = Math.toRadians(a);
        double valueofsin = Math.sin(Math.toRadians(a));
        
		System.out.println("The Absolute Value of c is: "+absolutevalueofc);
		System.out.println("The Square Root of a is: "+sqaurerootofa);
		System.out.println("The Maximum Value between a and b is: "+maxvalue);
		System.out.println("A to the Power of b is: "+power);
		System.out.println("The Round of a is: "+roundofa);
		System.out.println("The Square Root of (a^2+b^2): "+root);
		System.out.println("The Floor Value of b is: "+floorofb);
		System.out.println("The Floor Value of c is: "+floorofc);
		System.out.println("The Ceil Value of b is: "+ceilofb);
		System.out.println("The Ceil Value of c is: "+ceilofc);
		System.out.println("The Round of b is: "+roundofb);
		System.out.println("The Round of c is: "+roundofc);
		System.out.println("The Radian Value of a is: "+rad);
		System.out.print("The Sin Value of a is: "+valueofsin);
	}
}