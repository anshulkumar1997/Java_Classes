public class Account{
    private int accountId,balance;
    private String accountType;
    public boolean withdraw(int a){
        if(this.balance<a){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        this.balance=this.balance-a;
        System.out.println("Balance amount after withdraw: "+this.balance);
        return true;
    }
    public void setAccountId(int id){
        this.accountId=id;
    }
    public void setAccountType(String type){
        this.accountType=type;
    }
    public void setBalance(int b){
        this.balance=b;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public String getAccountType(){
        return this.accountType;
    }
}