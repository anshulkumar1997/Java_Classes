public class Ticket{
    private int ticketid,price;
    private static int availableTickets;
    public Ticket(){}
    public void setTicketid(int t){
        this.ticketid=t;
    }
    public void setPrice(int p){
        this.price=p;
    }
    public static void setAvailableTickets(int n){
        if(n>0)
        availableTickets=n;
    }
    public int getTicketid(){
        return this.ticketid;
    }
    public int getPrice(){
        return this.price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets){
        if(nooftickets>this.availableTickets)
        return -1;
        this.availableTickets=this.availableTickets-nooftickets;
        return nooftickets*this.price;
    }
}