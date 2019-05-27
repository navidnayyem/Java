package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//int x = scanner.nextInt();
		//int y = scanner.nextInt();
		//double result = 0.0;
		//double result = x / y;
		//System.out.println(result);
		
		//int size = scanner.nextInt();
		//int[] array = new int[size];
		//int position = scanner.nextInt();
		
		//Error : NegativeArraySizeException if negative
		//Error : ArrayIndexOutOfBoundsException if array size is greater
		//System.out.println(array[position]); 
		
		//int size = scanner.nextInt();
		//System.out.println(size); //Error: InputMismatchException
		
/*		int size = 5;
		System.out.print("Enter Array Size: ");
		
		try{
			size = scanner.nextInt();
			int[] array = new int [size];
			
		}catch(NegativeArraySizeException exception){
			// negative
			System.err.println(exception.toString());
			System.err.println("Wrong Input Negative Number");
			int[] array = new int [10];
			
		}catch(InputMismatchException exception){
			// type mismatch
			System.err.println("Input must be an integer");
			int[] array = new int [10];
		}
		System.out.println("Exceptions are taken care of"); */
		
		int size = 5;
		System.out.print("Enter Array Size: ");
		
		try{
			size = scanner.nextInt();
			int[] array = new int [size];
			

		}catch(Exception exception){
			// type mismatch
			System.err.println(exception.toString());
			System.err.println("Something bad happen");
			int[] array = new int [10];
		}
		System.out.println("Exceptions are taken care of");
		
	}

}
