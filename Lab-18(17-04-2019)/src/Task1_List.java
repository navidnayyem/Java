import java.util.ArrayList;
import java.util.List;

public class Task1_List {

	public static void main(String[] args) {

		List<String> listOfstring = new ArrayList<String>();
		listOfstring.add("689656154164");
		listOfstring.add("665265214");
		listOfstring.add("3186164");
		listOfstring.add("18456154");
		listOfstring.add("4188648948");
		listOfstring.add("75218135");
		listOfstring.add("4189496135");
		
		System.out.println(listOfstring.contains("3186164"));
		//listOfstring.remove(3);
		
		/*for(int i=0;i<listOfstring.size();i++){			
			System.out.println(listOfstring.get(i));		
		}*/
		
		for(String x : listOfstring){			
			System.out.println(x);		
		}
		
	}

}