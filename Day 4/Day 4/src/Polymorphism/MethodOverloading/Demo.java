package Polymorphism.MethodOverloading;

public class Demo {
    public static void main(String[] args) {
        Methods m =new Methods();

        m.display();
        m.display(10);
        m.display("Hi there");
        m.display(10, 20);
        m.display(10, "Hiiii");
        m.display("Baby, 23");

    }
}
