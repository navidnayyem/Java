
public class Task3_AverageValueOfAnArray {

	public static void main(String[] args) {
		int array[]= {10,15,20,50,13};
		double sum=0;
		
		for (int i=0;i<array.length;i++)
		{
			sum = sum + array[i];
		}
		double averagevalue = sum/(array.length);
		System.out.print("Average Value of an Array: "+averagevalue);
	}
}
