
public class MainApplication {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("AUDI","Black");
		Car c3 = new Car("BMW","Red",878);
		System.out.println(c3.getName());
		
		//c1.move();
		//c2.move();
		c3.setName("Porshe");
		c3.move();
	}
}
