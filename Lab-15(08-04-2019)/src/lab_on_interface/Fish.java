package lab_on_interface;

public class Fish extends Animal {
	
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fish(int legs){
		super(0);
	}
	
	public void play(){
		
	}
	
	public void walk(){
		System.out.println("\nFISH");
		System.out.println("Living in water");
		System.out.println("Fish can't walk.");
	}

	public void eat(){
		System.out.println("Fish can eat.");
	}

}
