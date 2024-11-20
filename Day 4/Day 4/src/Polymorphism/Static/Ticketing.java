package Polymorphism.Static;

public class Ticketing {
    private static int noOfTickets = 100;

    public String getTickets(int Tickets){
        if(Tickets < noOfTickets){
            noOfTickets -= Tickets;
            return "Valid purchase of tickets";
        }
        return "Sorry No available tickets";
    }
}
