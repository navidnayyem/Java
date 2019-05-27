import java.util.Scanner;


public class Task3_Print2DArrayDiagonally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//int [][] matrics = new int[4][5];
		int [][] matrics = { 
				 {1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12},
				 {13,14,15,16}
			};
		printDiagonal(matrics);
	}
		public static void printDiagonal(int [][] array){
			
			/*int i=0, j=0;
			while(i<array.length && j<array.length){ //while loop

				i++;
				j++;
				
			}*/
			
			for(int i = 0; i < array.length; i++)
			{
				for(int j = 0; j < array.length; j++)
				{
					if ((i == j) || (i + j == 3))
					{
						System.out.print(array[i][j]+ "\t");
					}
					else 
					{
						System.out.print("  ");
					}
					}
				System.out.println(" ");
			}
		}
}