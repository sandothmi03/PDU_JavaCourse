package Polymorphism.Static;

public class Ticketing2 {
    private static int noOfTickets = 100;

    public static String getTickets(int Tickets){
        if(Tickets < noOfTickets){
            noOfTickets -= Tickets;
            return "Valid purchase of tickets";
        }
        return "Sorry No available tickets";
    }
}
