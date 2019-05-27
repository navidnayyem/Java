package ulab;

public class ColoredPoint extends Point {
	
	String color;
	
	public ColoredPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	
	protected void getPoint(){
		System.out.println("Calling from Colored Point");
		System.out.println("(" + this.x + "," + this.y + ")" + " " + this.color);
	}

}