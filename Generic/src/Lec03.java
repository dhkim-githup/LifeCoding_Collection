class StudentInfo3{
    public int grade;
    StudentInfo3(int grade){ this.grade = grade; }
}

class EmployeeInfo3{
    public int rank;
    EmployeeInfo3(int rank){ this.rank = rank; }
}

class Person3<T,S>{
    public T info;
    public S id;
    Person3(T info, S id)
    {
    	this.info = info; 
    	this.id = id;
    }
}

public class Lec03 {
    public static void main(String[] args) {
        StudentInfo3 si = new StudentInfo3(5);
        System.out.println(si.grade); // 2
        
        Person3<StudentInfo3, Integer> p = new Person3<StudentInfo3, Integer>(si, 3);
        System.out.println(p.info.grade); // 2
        

    }
}