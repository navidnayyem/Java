package ulab;

public class Task1_Vehicles {

	int numberOfWheels;
	String name;
	int numberOfSeats;
	
	public Task1_Vehicles(int numberOfWheels, String name, int numberOfSeats) {

		this.numberOfWheels = numberOfWheels;
		this.name = name;
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	void move(){
		
		System.out.println(this.name + " Moves.");
		
	}
	
	void vehiclebreak(){
		
		System.out.println(this.name + " Breaks.");
		
	}

}
