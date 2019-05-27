
public class Debugging {

	public static void main(String[] args) {
		int y = 9;
		demo();
		System.out.println("Method Calling");
	}
		
	static void demo(){
		int n = 5;
		int x = 7;
		for(int i = 0; i < n ; i++){
			x = x * 5;
			System.out.println(x);
		}

	}

}