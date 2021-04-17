class StudentInfo2{
    public int grade;
    StudentInfo2(int grade){ this.grade = grade; }
}

class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
}

class Person2{
    public Object info;
    Person2(Object info){ this.info = info; }
}

public class Lec02_v2 {
    public static void main(String[] args) {
        StudentInfo2 si = new StudentInfo2(5);
        System.out.println(si.grade); // 2
        
        //Person2 p = new Person2(si);
        //System.out.println((Integer) p.info.grade); // 2
        

    }
}