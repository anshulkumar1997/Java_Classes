import java.util.Scanner; 
public class AccountDetails{
    public static void main (String[] args) {
        Account a;
        AccountDetails a1=new AccountDetails();
        a=a1.getAccountDetails();
        int amt=a1.getWithdrawAmount();
        a.withdraw(amt);
        
    }
    public Account getAccountDetails(){
        Account a=new Account();
        Scanner sc=new Scanner(System.in);
        int ai,b,c=0;
        String at;
        System.out.println("Enter account id:");
        ai=sc.nextInt();
        a.setAccountId(ai);
        System.out.println("Enter account type:");
        at=sc.next();
        a.setAccountType(at);
        while(c!=1){
        System.out.println("Enter balance:");
        b=sc.nextInt();
        if(b>0){
            c=1;
            a.setBalance(b);
            break;
        }
        System.out.println("Balance should be positive");
    }
        return a;
}
    public int getWithdrawAmount(){
        int c=0,amt=0;
        Scanner sc=new Scanner(System.in);
        while(c!=1){
            System.out.println("Enter amount to be withdrawn:");
            amt=sc.nextInt();
            if(amt>0)
            return amt;
            System.out.println("Amount should be positive");
        }
        return amt;
    }
}