public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    public Student(int id,String sn,String sa){
        this.studentId=id;
        this.studentName=sn;
        this.studentAddress=sa;
        this.collegeName="NIT";
    }
    public Student(int id,String sn,String sa,String cn){
        this.studentId=id;
        this.studentName=sn;
        this.studentAddress=sa;
        this.collegeName=cn;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public String getStudentAddress(){
        return this.studentAddress;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
}