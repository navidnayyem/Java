import java.util.Scanner;// Press CTRL + SHIFT + O

public class Task4_TakingInput {
	
	public static void main(String[] args) {
		
//		Scanner inputTaker = new Scanner(System.in);
//		System.out.print("Give your Input: ");
//		int number = inputTaker.nextInt();
//		System.out.println("Your Given Input is: "+number);
		
//		Scanner inputTaker = new Scanner(System.in);
//		System.out.print("Give your CGPA: ");
//		float CGPA = inputTaker.nextFloat();
//		System.out.println("Your Given Input is: "+CGPA);
		
//		Scanner inputTaker = new Scanner(System.in);
//		System.out.print("Give your Input: ");
//		String CGPA = inputTaker.nextLine();
//		System.out.println("Your Given Input is: "+CGPA);
		
		Scanner inputTaker = new Scanner(System.in);
		System.out.print("Give your Input: ");
		int CGPA = (int) inputTaker.nextFloat();
		System.out.println("Your Given Input is: "+CGPA);
	}
}
