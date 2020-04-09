import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String cd;
        int cid;
        long cnd;
        float dur;
        Call c=new Call();
        cd=sc.nextLine();
        c.parseData(cd);
        cid=c.getCallId();
        System.out.println("Call id:"+cid);
        cnd=c.getCalledNumber();
        System.out.println("Called number:"+cnd);
        dur=c.getDuration();
        System.out.println("Duration:"+dur);
    }
    
}