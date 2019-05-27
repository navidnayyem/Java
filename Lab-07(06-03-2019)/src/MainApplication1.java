
public class MainApplication1 {
	
	public static void main(String[] args) {
		Task1_RationalNumber r1 = new Task1_RationalNumber(5,7);
		Task1_RationalNumber r2 = new Task1_RationalNumber(2,3);
		Task1_RationalNumber add_result = r1.addition(r2);
		Task1_RationalNumber sub_result = r1.subtraction(r2);
		Task1_RationalNumber mul_result = r1.multiplication(r2);
		Task1_RationalNumber div_result = r1.division(r2);
		System.out.println("Addition(+)       Result: "+r1.toString()+" + "+r2.toString()+" = " + add_result.toString());
		System.out.println("Subtraction(-)    Result: "+r1.toString()+" - "+r2.toString()+" = " + sub_result.toString());
		System.out.println("Multiplication(*) Result: "+r1.toString()+" * "+r2.toString()+" = " + mul_result.toString());
		System.out.println("Division(/)       Result: "+r1.toString()+" / "+r2.toString()+" = " + div_result.toString());
	}
}