
public class DateCalculator {
	private int myBirthDate;
	private int myCurrentDate;
	private int calculateAge; 
	public int myAge;
		
	public DateCalculator(int myBirthDate,int myCurrentDate)
	{
		this.myBirthDate = myBirthDate;
		this.myCurrentDate = myCurrentDate;
	}
		
	public int calculateAge()
	{
		return this.myCurrentDate - this.myBirthDate;
	}
	
	public static void main(String[] args) {
		DateCalculator dc = new DateCalculator(1995,2019);	
		int myage = dc.calculateAge();
		System.out.println("I am "+ myage + " years old.");
	}
}