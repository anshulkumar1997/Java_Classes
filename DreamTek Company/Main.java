import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int id,n;
        String na;
        Associate a=new Associate();
        System.out.println("Enter the associate id:");
        id=sc.nextInt();
        a.setAssociateId(id);
        System.out.println("Enter the associate name:");
        na=sc.next();
        a.setAssociateName(na);
        System.out.println("Enter the number of days:");
        n=sc.nextInt();
        a.trackAssociateStatus(n);
        System.out.println("The associate "+a.getAssociateName()+" work status:"+a.getWorkStatus());
        
    }
}