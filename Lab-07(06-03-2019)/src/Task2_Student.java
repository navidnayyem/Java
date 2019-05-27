
public class Task2_Student {

	public static void main(String[] args) {
		private int ID;
		private String name;
		private String department;
		private double CGPA;

		public Student() {
			
		}
		
		public Task2_Student(int iD, String name) {
			ID = iD;
			this.name = name;
		}
		
		public Task2_Student(int iD, String name, String department) {
			ID = iD;
			this.name = name;
			this.department = department;
		}
		
		private int calculateCGPA(){
			return this.CPGA; 
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getCGPA() {
			return CGPA;
		}

		public void setCGPA(double cGPA) {
			CGPA = cGPA;
		}
		
		public String toString() {
			return "Task2_Student [ID=" + ID + ", name=" + name
					+ ", department=" + department + ", CGPA=" + CGPA + "]";
		}

}