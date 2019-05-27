
public class Main {

	public static void main(String[] args) {
		
		//Task1_Inheritance_Student _student = new Task1_Inheritance_Student("007", "Bond");
		//ULABStudent _ulabStudent = new ULABStudent("007","Bond","bond@ulab.edu.bd","BondMoodleInfo");
		//_ulabStudent.getInfo();
		
		//when calls child by parent it considers the super() called in child. 
		//Here only id and name of parent class will be seen.
		Task1_Inheritance_Student Student = new ULABStudent("007","Bond","bond@ulab.edu.bd","BondMoodleInfo");
		System.out.println(Student.getName());
		
		//error Student cannot be cast to ULABStudent
		//ULABStudent Student = (ULABStudent) new Student("007","Bond");
		//Student.getInfo();

	}
	
}