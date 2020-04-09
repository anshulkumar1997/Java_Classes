public class Employee{
    private String employeeId;
    private double salary;
    private String[] certification;
    private int rating;
    public Employee(String s,double d,String[] c){
        this.employeeId=s;
        this.salary=d;
        this.certification=c;
    }
    public void findRating(){
        int i,co=0;
        for (i=0;i<this.certification.length;i++)
        if(this.certification[i].equals("JAVA") || this.certification[i].equals("ORACLE") || this.certification[i].equals("GCUX") || this.certification[i].equals("CCNA") || this.certification[i].equals("AWS"))
        co++;
        this.rating=co;
    }
    public double calculateIncrement(){
         double in=0.00;
         if(this.rating==1){
             in=(0.02*this.salary);
             this.salary=this.salary+in;
             return in;
         }
         if(this.rating==2){
             in=(0.035*this.salary);
             this.salary=this.salary+in;
             return in;
         }
         if (this.rating==3){
             in=(0.05*this.salary);
             this.salary=this.salary+in;
             return in;
         } 
         if (this.rating==4){
             in=(0.075*this.salary);
             this.salary=this.salary+in;
             return in;
         } 
         if (this.rating==5){
             in=(0.1*this.salary);
             this.salary=this.salary+in;
             return in;
         }
         return in;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getRating(){
        return this.rating;
    }
    
}