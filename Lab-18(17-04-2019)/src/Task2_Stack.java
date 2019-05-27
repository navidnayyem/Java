import java.util.Stack;

public class Task2_Stack {

	public static void main(String[] args) {
		
		Stack<String> demo = new Stack<String>();
		demo.push("12345");
		demo.push("67890");

		for(String x : demo){			
			System.out.println(x);		
		}
		
	}

}
