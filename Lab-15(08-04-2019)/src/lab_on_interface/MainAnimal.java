package lab_on_interface;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cat c = new Cat("Fluffy");
		Fish f = new Fish(0);
		//Pet p = new Cat();
	    //Animal a = new Fish(0);
	    Animal s = new Spider(8);
	    
	    c.play();
		c.eat();

		f.walk();
		f.eat();
		s.eat();

	}

}