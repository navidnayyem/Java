import java.util.Scanner;


public class Task2_2D_Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//int [][] matrics = new int[4][5];
		int [][] matrics = { 
				   {1,2,3,4,5},
				   {6,7,8,9,10},
				   {11,12,13,14,15},
				   {16,17,18,19,20}
		};
		//matrics[3][1] = 5;
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(matrics[i][j] + " ");
			}
			System.out.println();
		}
	}
}