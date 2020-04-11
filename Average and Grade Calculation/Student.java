public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    public Student(int i,String n,int[] m){
        this.id=i;
        this.name=n;
        this.marks=m;
    }
    public void calculateAvg(){
        int i,sum=0;
        for(i=0;i<this.marks.length;i++){
            sum=sum+this.marks[i];
        }
        this.average=(float)sum/i;
    }
    public void findGrade(){
        if(this.average>=80 && this.average<=100)
        setGrade('O');
        else
        setGrade('A');
        for(int i=0;i<marks.length;i++){
            if(marks[i]<50){
                setGrade('F');
                break;
            }
        }
    }
    public void setId(int i){
        this.id=i;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setMarks(int[] m){
        this.marks=m;
    }
    public void setAverage(float a){
        this.average=a;
    }
    public void setGrade(char g){
        this.grade=g;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public float getAverage(){
        return this.average;
    }
    public char getGrade(){
        return this.grade;
    }
}