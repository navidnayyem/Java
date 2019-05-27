
public class Point {
	protected int x;
	protected int y;

	  public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }

	  public Point() { // default constructor
	    this.x = 0;
	    this.y = 0;
	  }

	  protected void getPoint(){
			System.out.println("Calling from Point");
			System.out.println("("+this.x+","+this.y+")");
		}
	}

