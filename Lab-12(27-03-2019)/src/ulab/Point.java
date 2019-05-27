package ulab;

public class Point {
	
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected void getPoint(){
		System.out.println("Calling from Point");
		System.out.println("("+this.x+","+this.y+")");
	}

	@Override
	public String toString() {

		return "X=" + this.x + " , Y=" + this.y;
		
	}
	
}