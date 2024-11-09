package Constructors.Activity1;

public class Demo {
    public static void main(String[] args){
        Car c1;
        c1 = new Car();
        c1.display();
        c1.engineStart();
        c1.engineStop();

        Car c2 = new Car(2013543, "2005", "Axio"); // parameteraized constructor
        c2.display();
        c2.engineStart();
        c2.engineStop();

        Car c3 = new Car(c1); //copying the values of c1 . copy constructor.
        c3.display();
        c3.engineStart();
        c3.engineStop();

        Car c4 = new Car(245683);
        c4.engineStart();
    }
}
