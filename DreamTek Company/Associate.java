public class Associate{
    private int associateId;
    private String associateName,workStatus;
    public Associate(){
        
    }
    public void setAssociateId(int x){
        this.associateId=x;
    }
    public void setAssociateName(String n){
        this.associateName=n;
    }
    public void setWorkStatus(String w){
        this.workStatus=w;
    }
    public int getAssociateId(){
        return this.associateId;
    }
    public String getAssociateName(){
        return this.associateName;
    }
    public String getWorkStatus(){
        return this.workStatus;
    }
    public void trackAssociateStatus(int n){
        if(n>0 && n<=20){
            this.setWorkStatus("Core skills");
            return;
        }
        if (n>20 && n<=40){
            this.setWorkStatus("Advanced modules");
            return;
        }
        if (n>40 && n<=60){
            this.setWorkStatus("Project phase");
            return;
        } 
        if(n>60){
            this.setWorkStatus("Deployed in project");
            return;
        }
    }
}