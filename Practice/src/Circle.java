public class Circle {
	double radius;
	static double PI=3.1416;
	
	public Circle()
	{
		radius = 1.0;
	}
	
	public Circle (double r)
	{
		this.radius=r;
	}

	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		Circle c4 = new Circle();
		Circle.PI= 4.3;
		System.out.println(c1.PI);
		System.out.println(c2.PI);
		System.out.println(c3.PI);
		System.out.println(c4.PI);
	}
}