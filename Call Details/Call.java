public class Call{
    private int callId;
    private long calledNumber;
    private float duration;
    public Call(){
        System.out.println("Enter the call details:");
    }
    public int getCallId(){
        return this.callId;
    }
    public long getCalledNumber(){
        return this.calledNumber;
    }
    public float getDuration(){
        return this.duration;
    }
    public void parseData(String s){
        String[] n=s.split(":");
        this.callId=Integer.parseInt(n[0]);
        this.calledNumber=Long.parseLong(n[1]);
        this.duration=Float.parseFloat(n[2]);
    }
}