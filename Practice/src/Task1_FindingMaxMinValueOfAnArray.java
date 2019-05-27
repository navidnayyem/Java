import java.util.Scanner;

public class Task1_FindingMaxMinValueOfAnArray {

	public int max(int [] array) {
		int max = 0;
		for(int i=0; i<array.length; i++ ) {
			if(array[i]>max) {
				max = array[i];
				}
		}
		return max;
	}
			   
	public int min(int [] array) {
		int min = array[0];
		for(int i=0; i<array.length; i++ ) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
			   
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array: ");
		n = s.nextInt();
		int[] array = new int[n];
		System.out.println("Enter all the elements: ");
		for(int i = 0; i < n; i++)
		{
			array[i] = s.nextInt();
		}
		
		//int[] array = {10,15,20,50,13};
		Task1_FindingMaxMinValueOfAnArray m = new Task1_FindingMaxMinValueOfAnArray();
		System.out.println("Maximum Value in the Array = " +m.max(array));
		System.out.println("Minimum Value in the Array = " +m.min(array));
	}
}