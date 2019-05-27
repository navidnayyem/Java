
public class Task2_Triangle {
	
	private int a;
	private int b;
	private int c;
	private int s;
	
	public Task2_Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.s = (a+b+c)/2;
	}
	
	public double getArea(){
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}	
}