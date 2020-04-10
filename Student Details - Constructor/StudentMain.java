import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s;
        int id,c=0,co=0;
        String sn,sa,cn,ch;
        System.out.println("Enter Student's Id:");
        id=sc.nextInt();
        System.out.println("Enter Student's Name:");
        sn=sc.next();
        System.out.println("Enter Student's address:");
        sa=sc.next();
        while(c!=1){
            System.out.println("Whether the student is from NIT(Yes/No):");
            ch=sc.next();
            if(ch.contains("yes") || ch.contains("YES")){
                co=1;
                c=1;
                break;
            }
            if(ch.contains("no") || ch.contains("NO")){
                c=1;
                break;
            }
            System.out.println("Wrong Input");
        }
        if(co==1)
        s=new Student(id,sn,sa);
        else{
            System.out.println("Enter the college name:");
            cn=sc.next();
            s=new Student(id,sn,sa,cn);
        }
        System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student name:"+s.getStudentName());
        System.out.println("Address:"+s.getStudentAddress());
        System.out.println("College name:"+s.getCollegeName());
    }
}