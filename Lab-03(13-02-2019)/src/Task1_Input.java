import java.util.Scanner;
import java.lang.Math;

public class Task1_Input {

	public static void main(String[] args) {
	
		Scanner inputReader = new Scanner(System.in);
//		System.out.print("Give Two Numbers: ");
//		int numberOne = inputReader.nextInt();
//		int numberTwo = inputReader.nextInt();
//		int result = (int) Math.pow(numberOne,numberTwo);
		
//		int numberOne = inputReader.nextInt();
//		int result = (int) Math.pow(numberOne,numberOne);
		
//		System.out.println("\nThe Numbers are "+ numberOne + " and " + numberTwo);
//		System.out.println("\nThe result is "+ result);
		
		int value = 65;
		//double result = Math.toDegrees(a);
		double result = Math.toRadians(value);
		System.out.println("The result is "+ Math.tan(result));
	}
}

