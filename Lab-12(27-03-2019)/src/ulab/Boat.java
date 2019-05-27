package ulab;

public class Boat extends Task1_Vehicles {
	
	int propeller;

	public Boat(int numberOfWheels, String name, int numberOfSeats,int propeller) {
		super(numberOfWheels, name, numberOfSeats);
		this.propeller = propeller;
		System.out.println("\nVehicle Type: BOAT");
		System.out.println("Number of Wheels: " + super.numberOfWheels + 
				"\nName of the Boat: "+  super.name +
				"\nNumber of Seats: " + super.numberOfSeats +  
				"\nNumber of Propeller: " + this.propeller);
		super.move();
		super.vehiclebreak();
	}
	
}