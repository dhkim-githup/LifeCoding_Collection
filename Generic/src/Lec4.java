class StudentInfo4{
    public int grade;
    StudentInfo4(int grade){ this.grade = grade; }
}

class EmployeeInfo4{
    public int rank;
    EmployeeInfo4(int rank){ this.rank = rank; }
}

class Person4<T,S>{
    public T info;
    public S id;
    Person4(T info, S id)
    {
    	this.info = info; 
    	this.id = id;
    }
    
    public <U> void printInfo(U info) {
    	System.out.println("info =>"+info);
    }
    
}

public class Lec4 {
    public static void main(String[] args) {
        EmployeeInfo4 e = new EmployeeInfo4(1);
        System.out.println(e.rank);
        
        Integer i = new Integer(10);
        
        //Person4<EmployeeInfo4, Integer> pi = new Person4<EmployeeInfo4, Integer>(e,i);
        Person4<EmployeeInfo4,Integer> pi = new Person4(e,i);
        
        System.out.println(pi.info);        
        System.out.println(pi.info.rank);
        System.out.println(pi.id);
        
        pi.<EmployeeInfo4>printInfo(e);
        pi.printInfo(1);
        
        		

    }
}