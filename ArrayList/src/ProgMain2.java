import java.util.ArrayList;
import java.util.List;

public class ProgMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("one");
		a1.add("two");
		a1.add("three");
		
		for(int i=0; i<a1.size(); i++) {
			String value = a1.get(i);
			System.out.println(value);
			System.out.println(a1.get(i));
		}		
		
		
	}
}
