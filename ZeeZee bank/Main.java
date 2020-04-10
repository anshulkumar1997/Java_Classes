import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long acn;
        double ba,d,w;
        int c;
        System.out.println("Enter the account number:");
        acn=sc.nextLong();
        System.out.println("Enter the available amount in the account:");
        ba=sc.nextDouble();
        Account a=new Account(acn,ba);
        System.out.println("Enter the amount to be deposited:");
        d=sc.nextDouble();
        a.deposit(d);
        System.out.println("Available balance is:"+(String.format("%.2f",a.getBalanceAmount())));
        System.out.println("Enter the amount to be withdrawn:");
        w=sc.nextDouble();
        c=a.withdraw(w);
        if(c==-1)
        System.out.println("Insufficient balance");
        System.out.println("Available balance is:"+(String.format("%.2f",a.getBalanceAmount())));
        
        
    }
}