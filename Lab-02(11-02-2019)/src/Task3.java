
public class Task3 {

	public static void main(String[] args) {
		
		int x = 129;
		byte y = 3; // range 127
		//x = y; // automatic type conversion
		y = (byte) x;
		System.out.print(y);
		//System.out.print(x);
	}
}