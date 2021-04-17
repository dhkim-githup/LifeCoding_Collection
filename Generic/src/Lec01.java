
public class Lec01 {
	
	public static void main(String[] args) {
		
		System.out.println("HI");
		
		
		Person<String> p1 = new Person<String>();
		
		p1.info = "String";
		
		System.out.println(p1.info);
		
		
	}

}

class Person<T>{
	public T info;
}
