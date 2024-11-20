package Polymorphism.MethodOverriding;

public class Demo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayInfo();

        Bike b = new Bike();
        b.displayInfo();

        Car c = new Car();
        c.displayInfo();
    }
}
