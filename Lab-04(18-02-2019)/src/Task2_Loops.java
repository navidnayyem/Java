
public class Task2_Loops {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7};
		int [] roll = new int [5];
		roll[0] = 1;
		roll[1] = 2;
		roll[2] = 7;
		roll[3] = 8;
		roll[4] = 9;

		// for loop
		for(int i = 0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}

		// for each loop
		for(int x : roll) {
			System.out.print("\n"+ x + " ");
		}
		
		//while loop
		//int j = 0;
		//while (j < 10){
			
		//	j++;
		//}
		
		//do while
		//int k = 0;
		//do{
			
			//k++;
		//}while(k < 10);
	}
}
