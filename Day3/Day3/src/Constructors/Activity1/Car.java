package Constructors.Activity1;

public class Car {
    public int engineNumber;
    public String yom;
    public String model;

    public void engineStart(){
        System.out.println(engineNumber + " Engine Started.");
    }
    public void engineStop(){
        System.out.println(engineNumber + " Engine Stopped.");
    }
    public void display(){
        System.out.println("engineNumber: " + this.engineNumber);
        System.out.println("yom: " + this.yom);
        System.out.println("model: " + this.model);
    }

    public Car(){ //default constructor
        this.engineNumber = 20031006;
        this.yom = "2003";
        this.model = "Hilux";

    }
    public Car(int engineNumber, String yom, String model){ // parameterized constructor. we can create any number of parameterized constructors.
        this.engineNumber = engineNumber; // we have to put the same one here.
        this.yom = yom;
        this.model = model;
    }
    public Car(int engineNumber){
        this.engineNumber = engineNumber;
    }
    public Car(Car car1){ //copy constructor. we only can use one copy constructor.
        this.engineNumber = car1.engineNumber;
        this.yom = car1.yom;
        this.model = car1.model;
    }
// if you just need the parameterized and copy constructors only, you need to create the detault constructor first. just the body.
// ex: public Car(){}
}
