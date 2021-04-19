import java.util.ArrayList;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		
		a1.add("one");
		a1.add("two");
		a1.add("three");
		
		for(int i=0; i<a1.size(); i++) {
			String value = (String) a1.get(i);
			System.out.println(value);
			System.out.println(a1.get(i));
		}
		
	}

}
