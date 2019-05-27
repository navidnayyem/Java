import java.util.Scanner;


public class Task2_InsertElementIntoAnArray {

	public static void main(String[] args) {
		int array[]= {10,15,20,50,13};
		System.out.print("Enter a Number to Insert in an Array: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.print("Original Array: ");
		for (int k=0;k<array.length;k++){
			System.out.print(+array[k] + " ");
		}
		
		for (int i=0;i<array.length;i++)
		{
			if(i==array.length-1)
			{
				array[i] = number;
			}
		}
		System.out.print("\nThe Array after Inserting Element: ");
		for (int k=0;k<array.length;k++){
			System.out.print(+array[k] + " ");
		}

	}

}
