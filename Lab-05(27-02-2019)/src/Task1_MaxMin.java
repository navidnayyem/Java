
public class Task1_MaxMin {

	public static void main(String[] args) {
		int array[] = {10,15,20,50,13};
		int i,j,k;
		int maximum=array[0];
		int minimum=array[0];
		
		for (i=0;i<array.length;i++){
			for (j=0;j<array.length;j++){
				if (array[i]>maximum)
				{
					maximum = array[i];
				}

				if (array[j]<minimum)
				{
					minimum = array[j];
				}
			}
		}
		
		System.out.print("Original Array: ");
		for (k=0;k<array.length;k++){
			System.out.print(+array[k] + " ");
		}
		
		System.out.println("\n\nMaximum Value of an Array: "+maximum);
		System.out.println("Minimum Value of an Array: "+minimum);
	}
}