package Constructors.Exercise2;

public class Demo {
    public static void main(String[] args) {
        Aquarium aq1 = new Aquarium();
        aq1.displayInfo();

        //Aquarium aq1 = new Aquarium(); we can you like this as well.

        Aquarium aq2 = new Aquarium(02, "water2", 30, true);
        aq2.displayInfo();

        Aquarium aq3 = new Aquarium(03, "water3", 35, false);
        aq3.displayInfo();

        Aquarium aq4 = new Aquarium(aq2);
        aq4.displayInfo();

    }
}
