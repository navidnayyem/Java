
public class Task1_RationalNumber {
	
	private int numerator = 0;
	private int denominator = 1;
		
	public Task1_RationalNumber(int numerator, int denominator) {

		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String toString(){
		 return this.numerator+"/"+this.denominator;
	}
	
	/*private int[] getValues(Rational r){
	  int[] numbers = new int[4];
	  numbers[0] = this.numerator;
	  numbers[1] = this.denominator;
	  numbers[2] = r.numerator;
	  numbers[3] = r.denominator;
	  return numbers;
	}*/
	
	public Task1_RationalNumber addition(Task1_RationalNumber r){
		//int[] values = getValues(r);
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d+b*c;
		int newDenominator = b*d;
		Task1_RationalNumber result = new Task1_RationalNumber(newNumerator,newDenominator);
		return result;
	}
	
	public Task1_RationalNumber subtraction(Task1_RationalNumber r){
			
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d-b*c;
		int newDenominator = b*d;
		Task1_RationalNumber result = new Task1_RationalNumber(newNumerator,newDenominator);
		return result;	
	}
	
	public Task1_RationalNumber multiplication(Task1_RationalNumber r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*c;
		int newDenominator = b*d;
		Task1_RationalNumber result = new Task1_RationalNumber(newNumerator,newDenominator);
		return result;	
	}
	
    public Task1_RationalNumber division(Task1_RationalNumber r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d;
		int newDenominator = b*c;
		Task1_RationalNumber result = new Task1_RationalNumber(newNumerator,newDenominator);
		return result;	
	}
	//return new Task1_RationalNumber((this.numerator*r.denominator)+(this.denominator*r.numerator),(this.denominator*r.denominator));
}