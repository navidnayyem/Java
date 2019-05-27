package abstractclass;

public class Main {

	public static void main(String[] args) {
		
		Shape s = new Square(5);
		Shape s1 = new Rectangle(2,2);
		Shape s2 = new Triangle(3,3,3);
		
		double area = s.getArea();
		double perimeter = s.getPerimeter();
		double area1 = s1.getArea();
		double perimeter1 = s1.getPerimeter();
		double area2 = s2.getArea();
		double perimeter2 = s2.getPerimeter();
		
		System.out.println("Area of Square = " + area);
		System.out.println("Perimeter of Square = " + perimeter);
		System.out.println("\nArea of Rectangle = " + area1);
		System.out.println("Perimeter of Rectangle = " + perimeter1);
		System.out.println("\nArea of Triangle = " + area2);
		System.out.println("Perimeter of Triangle = " + perimeter2);
		
	}

}
