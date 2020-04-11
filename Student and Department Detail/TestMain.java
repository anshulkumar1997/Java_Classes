import java.util.Scanner;
public class TestMain{
    public static void main (String[] args) {
        
    
    Student s=createStudent();
    Department d=s.getDepartment();
    System.out.println("Department id:"+d.getDid());
    System.out.println("Department name:"+d.getDname());
    System.out.println("Student id:"+s.getSid());
    System.out.println("Student name:"+s.getSname());
    }
    public static Student createStudent(){
        Scanner sc=new Scanner(System.in);
        int did,sid;
        String sname,dname;
        Department d= new Department();
        Student s=new Student();
        System.out.println("Enter the Department id:");
        did=sc.nextInt();
        d.setDid(did);
        System.out.println("Enter the Department name:");
        dname=sc.next();
        d.setDname(dname);
        System.out.println("Enter the Student id:");
        sid=sc.nextInt();
        s.setSid(sid);
        System.out.println("Enter the Student name:");
        sname=sc.next();
        s.setSname(sname);
        s.setDepartment(d);
        return s;
    }
}