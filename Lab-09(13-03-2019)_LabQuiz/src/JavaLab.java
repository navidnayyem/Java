
public class JavaLab {

	public String name;
	public int id;
	public String department;
	public int semester;
	private double CGPA;
	
	public Constructor1(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public Constructor2(String department,int semester)
	{
		this.department = department;
		this.semester = semester;
	}
	
	public Constructor3(double CGPA)
	{
		this.CGPA = CGPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
}