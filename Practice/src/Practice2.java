import java.util.Scanner;

public class Practice2
{
   public static void main(String args[])
   {
       int size, insert, i, pos;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	 
       System.out.print("Enter Array Size: ");
       size = scan.nextInt();
	   
       System.out.println("Enter Array Elements: ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Element to be Insert: ");
       insert = scan.nextInt();
       System.out.print("At Which Position?(Enter Index Number): ");
       pos = scan.nextInt();
       
       // now create a space at the required position
       for(i=size; i>pos; i--)
       {
           arr[i] = arr[i-1];
       }
       arr[pos] = insert;

       System.out.print("The Array after Inserting Element is: ");
       for(i=0; i<size+1; i++)
       {
           System.out.print(arr[i]+ " ");
       }
   }
}