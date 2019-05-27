import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 

public class Task1_GiveInputToTXTFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputscanner = new Scanner (System.in);
		File file = new File("G:\\CSE413-JAVA LAB\\Lab-10(14-03-2019)\\src\\Input.txt"); 
		Scanner filescanner = new Scanner(file);
		while (true)
		{
			int input = inputscanner.nextInt();
			System.out.println(input);
			if (input == 0)
			{
				break;
			}
		}
	}
}