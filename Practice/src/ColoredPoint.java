import java.awt.Color;

public class ColoredPoint extends Point {  
	  private String color; 

	  public ColoredPoint(int x, int y, String color) {
	    super(x,y);
	    this.color = color; 
	  }

	  public ColoredPoint(int x, int y) { 
	    this(x, y, Color.BLACK); // point with default value 
	  } 

	  public ColoredPoint() {  
	    color = Color.BLACK;    // what will be the values of x and y?
	  }

	  protected void getPoint(){
			System.out.println("Calling from Colored Point");
			System.out.println("(" + this.x + "," + this.y + ")" + " " + this.color);
		} 
}