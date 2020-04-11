import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
        Student s;
        s=getStudentDetails();
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+(String.format("%.2f",s.getAverage())));
        System.out.println("Grade:"+s.getGrade());
    }
    public static Student getStudentDetails(){
        Scanner sc=new Scanner(System.in);
        int i,id,no=0,co=0;
        String na;
        System.out.println("Enter the id:");
        id=sc.nextInt();
        System.out.println("Enter the name:");
        na=sc.next();
        while(co!=1){
        System.out.println("Enter the no of subjects:");
        no=sc.nextInt();
        if(no>0){
            co=1;
        break;}
        else
        System.out.println("Invalid number of subject");
    }
    int[] m=new int[no];
    for(i=0,co=0;i<m.length;i++){
        while(co!=1){
        System.out.println("Enter mark for subject "+(i+1)+":");
        m[i]=sc.nextInt();
        if(m[i]>0 && m[i]<=100)
            break;
        System.out.println("Invalid Mark");    
        }
    }
    Student s=new Student(id,na,m);
    return s;
    }
}