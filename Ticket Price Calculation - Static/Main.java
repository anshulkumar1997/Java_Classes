import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int tid,price,n,nl,at,i,to,s;
        System.out.println("Enter no of bookings:");
        nl=sc.nextInt();
        System.out.println("Enter the available tickets");
        at=sc.nextInt();
        Ticket t=new Ticket();
        t.setAvailableTickets(at);
        for(i=0;i<nl;i++){
            System.out.println("Enter the ticketid:");
            tid=sc.nextInt();
            t.setTicketid(tid);
            System.out.println("Enter the price:");
            price=sc.nextInt();
            t.setPrice(price);
            System.out.println("Enter the no of tickets:");
            n=sc.nextInt();
            s=t.getAvailableTickets();
            to=t.calculateTicketCost(n);
            if(to==-1){
            System.out.println("Tickets not sufficient / available");
            return;}
            System.out.println("Available Tickets: "+s);
            System.out.println("Total Amount:"+to);
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
            
        }
    }
}