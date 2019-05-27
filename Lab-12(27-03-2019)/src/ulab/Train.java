package ulab;

public class Train extends Task1_Vehicles {
	
	int numberOfCompartments;

	public Train(int numberOfWheels, String name, int numberOfSeats,int numberOfCompartments) {
		super(numberOfWheels, name, numberOfSeats);
		this.numberOfCompartments = numberOfCompartments;
		System.out.println("Vehicle Type: TRAIN");
		System.out.println("Number of Wheels: " + super.numberOfWheels + 
				"\nName of the Train: "+ super.name + 
				"\nNumber of Seats: " + super.numberOfSeats + 
				"\nNumber of Compartments: " + this.numberOfCompartments); 
		super.move();
		super.vehiclebreak();
	}
	
}