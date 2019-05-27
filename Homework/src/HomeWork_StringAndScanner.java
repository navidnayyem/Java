import java.util.Scanner;

public class HomeWork_StringAndScanner {
	
	static int isSubstring(String S1, String S2) 
    { 
        int LenS1 = S1.length(); 
        int LenS2 = S2.length(); 
      
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= LenS2 - LenS1; i++) { 
            int j; 
      
            /* For current index i, check for pattern match */
            for (j = 0; j < LenS1; j++) 
                if (S2.charAt(i + j) != S1.charAt(j)) 
                    break; 
      
            if (j == LenS1) 
                return i; 
        } 
        return -1; 
    } 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String S1 = scanner.nextLine();
		System.out.print("Enter String 2: ");
		String S2 = scanner.nextLine();
		
		// Length of S1 and S2 String
		System.out.println("\nThe Length of String S1 is " +S1.length() + " and String S2 is " +S2.length());
		
		//Replacing All Spaces of String S1 and S2 to Underscore
		String ReplaceS1 = S1.replace(" ", "_");
		String ReplaceS2 = S2.replace(" ", "_");
		System.out.println("\nAfter Replacing All Spaces of String S1 to Underscore -> " +ReplaceS1);
		System.out.println("After Replacing All Spaces of String S2 to Underscore -> " +ReplaceS2);
		
		//Print the First Character of String S1
		System.out.println("\nThe First Character of String S1 is " +S1.charAt(0));
		
//		if(S1.equals(S2)){ //when Strings S1 and S2 are Equal
//			System.out.println("\nBoth Strings S1 and S2 are Equal.");
//		}else{
//			System.out.println("\nBoth Strings S1 and S2 are not Equal.");
//		}
		
		// Compare the String S1 and S2 and Print “Equal” or “Not Equal”
		int comparison = S1.compareTo(S2);
		if (comparison == 0) {
			System.out.println("\nString S1 and S2 are EQUAL");
		} else {
			System.out.println("\nString S1 and S2 are not EQUAL");
		}
		
//		String character = "a";
//		int position =  S1.indexOf(character);
//		System.out.println("\nThe First Occurrence of Character ‘a’ in String S1 is at Position " +position);
//		//prints -1 if the character 'a' is not found in the string
	
		// First Occurrence of Character ‘a’ in String S1
		int indexOf_a = S1.indexOf('a');

		if (indexOf_a < 0) {
			System.out.println("\nCHARECTER a is NOT PRESENT in String S1");
		} else {
			System.out.println("\nFirst Occurrence of Character ‘a’ in S1 is: " +indexOf_a);
		}
		
		//Substring
		int result = isSubstring(S1, S2); 
        
        if (result == -1) {
            System.out.println("\nThe Substring is Not Present."); 
        }else {
            System.out.println("\nThe Substring is Present at Index " +result);
        }
        
        // Convert the String S1 to Lower Case and String S2 to Upper Case Letter
		System.out.println("\nThe Lower Case of String S1: " +S1.toLowerCase());
		System.out.println("The Upper Case of String S2: "   +S2.toUpperCase());
		
		//Save the String S1 to a Character Array
		char[] CharacterArray = S1.toCharArray();
		System.out.println("\nThe Character Array of String S1 are: ");
		for(int i = 0; i<CharacterArray.length; i++) { 
            System.out.println(CharacterArray[i]); 
        } 
	}
}