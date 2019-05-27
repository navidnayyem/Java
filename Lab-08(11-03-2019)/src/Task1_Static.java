
public class Task1_Static {

	public static int add(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		//Task1_Static m = new Task1_Static();
		//m.add(3,4);
		//Task1_Static.add(3,4);
		add(3,4);
		System.out.println("Addition of 3 and 4 is "+add(3,4));
	}
	
}