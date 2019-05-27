package interfacetest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainCar {

	public static void main(String[] args) {
		
		List <String> listOfString_1 = new ArrayList<String>();
		List <String> listOfString_2 = new LinkedList<String>();
		ICar car = new AUDI();
		car.move();
		car.accelerate();

	}

}
