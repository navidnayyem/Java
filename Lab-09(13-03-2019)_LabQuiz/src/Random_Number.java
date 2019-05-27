import java.util.Random;

public class Random_Number {
	public static void main(String[] args) {
		int n = 1000, t1 = 0, t2 = 1;
	    System.out.print("First " + n + " terms: \n");
	    
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.print(t1 + "\n");
	    	if(t2<1000)
	    	{
	    		int sum = t1 + t2;
	    		t1 = t2;
	    		t2 = sum;
	    	} else { 
	    			break;
	    	}
	    }
	}
}