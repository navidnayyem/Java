
public class ULABStudent extends Task1_Inheritance_Student{
	
	String email;
	String MoodleInformation;

	
	public ULABStudent(String iD, String name, String email,String moodleInformation) {
		super(iD, name);//calling parent constructor
		//this.ID=iD;
		//this.Name = name;
		//this.email = email;
		this.email = email;
		this.MoodleInformation = moodleInformation;
	}
	
	public void getInfo(){
		
		System.out.println(super.ID + "--" + super.Name + "-" + '\n' + this.email + "--" + this.MoodleInformation);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMoodleInformation() {
		return MoodleInformation;
	}

	public void setMoodleInformation(String moodleInformation) {
		MoodleInformation = moodleInformation;
	}
	
}