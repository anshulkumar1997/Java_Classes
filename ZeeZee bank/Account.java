public class Account{
    private long accountNumber;
    private double balanceAmount;
    public Account(long ac,double ba){
        this.accountNumber=ac;
        this.balanceAmount=ba;
    }
    public void deposit(double d){
        this.balanceAmount=this.balanceAmount+d;
    }
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    public int withdraw(double d){
        if (this.balanceAmount<d)
        return -1;
        this.balanceAmount=this.balanceAmount-d;
        return 1;
    }
}