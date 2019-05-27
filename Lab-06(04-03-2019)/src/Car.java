
public class Car {

	private String name;
	private String color;
	private int carNumber;
	
	// default constructor
	public Car(){ 
		
	}
	
	public Car(String name, String color){ 
		
		this.name = name;
		this.color = color;
	}
	
	public Car(String name, String color, int carNumber){ 
		
		this.name = name;
		this.color = color;
		this.carNumber = carNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void move(){
		System.out.println(this.name + " is moving");
	}
	
	
	
}
