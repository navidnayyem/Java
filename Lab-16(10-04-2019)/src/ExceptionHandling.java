import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter Number1: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter Number2: ");
			int number2 = scanner.nextInt();
			System.out.println(number1 + "/" + number2 + " = " + number1 / number2);
			
			System.out.print("Enter Array Size: ");
			int size = scanner.nextInt();
			int[] array = new int[size];
			int a[] = { 2 };
			a[30] = 50;

		} catch (ArithmeticException exception) {
			System.err.println(exception.toString());
			System.err.println("Divide by 0: " + exception);
		} catch (NegativeArraySizeException exception) {
			// Negative
			System.err.println(exception.toString());
			System.err.println("Size Value must be positive");
			int[] arr = new int[5];
		} catch (NumberFormatException exception) {
			// NumberFormatException
			System.err.println(exception.toString());
			System.err.println("Input must be in a number format");
		} catch (InputMismatchException exception) {
			// type mismatch
			System.err.println(exception.toString());
			System.err.println("Input must be an integer");
		} catch (Exception exception) {
			// Exception
			System.err.println(exception.toString());
			System.out.println("Input is a negative number.");
		} finally {
			System.out.println("Exceptions are taken care of");
		}

	}

}