import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner temp_input = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: ");
		double celsius = temp_input.nextDouble();
		double fahrenheit = 32 + ((9 * celsius) / 5);
		System.out.println("Temperature in Celsius    : "+ celsius + " Degree");
		System.out.println("Temperature in Fahrenheit : "+ fahrenheit + " Degree");
	}
}