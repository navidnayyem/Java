import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {
		
		Set<Integer> myset = new TreeSet<Integer>();
		//Set<Integer> myset = new HashSet<Integer>();
		
		myset.add(4);
		myset.add(5);
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(34);
		myset.add(32);
		
		System.out.println(myset.toString());
		
		
	}

}
