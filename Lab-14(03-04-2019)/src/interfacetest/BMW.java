package interfacetest;

public class BMW implements ICar{
	
	@Override
	public void move() {
		System.out.println("BMW is Moving");
	}

	@Override
	public void stop() {
		System.out.println("BMW has been stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("BMW is being accelerated");
	}

}
