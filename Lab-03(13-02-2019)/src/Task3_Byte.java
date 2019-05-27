
public class Task3_Byte {

	public static void main(String[] args) {
		byte a = 8;
		byte b = 16;
		byte OrResult = (byte) (a | b);
		byte AndResult = (byte) (a & b);
		byte result = (byte) (a >> 4);
		int result1 = (byte) (a >> 3);
		int result2 = (a >>> 3);
		
		System.out.println("OR : "+OrResult);
		System.out.println("AND: "+AndResult);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
