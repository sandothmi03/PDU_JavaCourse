package Polymorphism.Static;

public class Demo {
    public static void main(String[] args) {
        Ticketing buy1 = new Ticketing();
        System.out.println(buy1.getTickets(10));

        Ticketing buy2 = new Ticketing();
        System.out.println(buy2.getTickets(10));

        Ticketing buy3 = new Ticketing();
        System.out.println(buy3.getTickets(90));
    }
}
