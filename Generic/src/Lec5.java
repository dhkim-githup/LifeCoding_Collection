abstract class Info{
	public abstract int getLevel();
}

class EmployeeInfo5 extends Info{
	public int rank;
	EmployeeInfo5(int rank) { this.rank = rank; }
		// TODO Auto-generated constructor stub
	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.rank;
	}
}

class Person5<T extends Info>{
	public T info;
	Person5(T info){ this.info = info; }
}

public class Lec5 {
    public static void main(String[] args) {
        
    	Person5<EmployeeInfo5> p1 = new Person5<EmployeeInfo5>(new EmployeeInfo5(1));
    	//Person5<String> p2 = new Person5<String>("부장")

    }
}