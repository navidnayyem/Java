package ulab;

public class Car extends Task1_Vehicles{

	public Car(int numberOfWheels, String name, int numberOfSeats) {
		super(numberOfWheels, name, numberOfSeats);
		System.out.println("\nVehicle Type: CAR");
		System.out.println("Number of Wheels " + super.numberOfWheels + 
				"\nName of the Car: "+ super.name+ 
				"\nNumber of Seats " + super.numberOfSeats);
		super.move();
		super.vehiclebreak();
	}

}