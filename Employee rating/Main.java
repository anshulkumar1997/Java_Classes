import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s;
    double d,in;
    int i,r,n;
    System.out.println("Enter the employee id:");
    s=sc.next();
    System.out.println("Enter the salary:");
    d=sc.nextDouble();
    System.out.println("Enter the no of certification complete:");
    n=sc.nextInt();
    String[] cn=new String[n];
    System.out.println("Enter the certification names:");
    for (i=0;i<cn.length ;i++ )
        cn[i]=sc.next();
    Employee e = new Employee(s,d,cn);
    e.findRating();
    in=e.calculateIncrement();
    r=e.getRating();
    d=e.getSalary();
    System.out.println("Your rating is "+r);
    System.out.println("Increment amount is "+(String.format("%.2f",in)));
    System.out.println("Current salary "+(String.format("%.2f",d)));
}
    
}
