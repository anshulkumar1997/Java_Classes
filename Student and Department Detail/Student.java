public class Student{
    private int sid;
    private String sname;
    private Department department;
    public void setSid(int s){
        this.sid=s;
    }
    public void setSname(String sn){
        this.sname=sn;
    }
    public void setDepartment(Department d){
        this.department=d;
    }
    public int getSid(){
        return this.sid;
    }
    public String getSname(){
        return this.sname;
    }
    public Department getDepartment(){
        return this.department;
    }
    
}