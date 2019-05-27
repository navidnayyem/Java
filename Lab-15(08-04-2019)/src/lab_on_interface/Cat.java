package lab_on_interface;

public class Cat extends Animal implements Pet {
	String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat(){
		super(4);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void play(){
		System.out.println("CAT");
		System.out.println(name + " can play.");
	}
	
	public void eat(){
		System.out.println(name + " can eat.");
	}
	
}
