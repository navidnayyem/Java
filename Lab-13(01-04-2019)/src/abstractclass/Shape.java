package abstractclass;


public abstract class Shape {
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}

class Square extends Shape{

	int side;
	
	public Square(int side){
		this.side = side;
	}
	
	@Override
	public double getArea(){
		return this.side * this.side;
	}
	
	@Override
	public double getPerimeter() {
		return 4 * this.side;
	}
}

class Rectangle extends Shape{
		
	int length,width;
	
	public Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {

		return length * width;
	}

	@Override
	public double getPerimeter() {

		return 2 * (length + width);
	}
}

class Triangle extends Shape{
	
	double a,b,c;
	double s;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		s = ((this.a+this.b+this.c)/2.0);
	} 

	@Override
	public double getArea() {

		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double getPerimeter() {

		return this.s;
	}
}
