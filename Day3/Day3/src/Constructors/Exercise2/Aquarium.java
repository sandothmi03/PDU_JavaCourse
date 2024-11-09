package Constructors.Exercise2;

public class Aquarium {
    public int tankID;
    public String waterType;
    public int temperature;
    public boolean lighting;

    public void displayInfo(){
        System.out.println("TankID is: " + this.tankID);
        System.out.println("WaterType is: " + this.waterType);
        System.out.println("Temperature is: " + this.temperature);
        System.out.println("Lighting is: " + this.lighting);
    }

    public Aquarium(){
        this.tankID = 01;
        this.waterType = "water";
        this.temperature = 25;
        this.lighting = false;
    }
    //public Aquarium(){} we can just use like this as well if we don't need any value for default constructor

    public Aquarium(int tankID, String waterType, int temperature, boolean lighting){
        this.tankID = tankID;
        this.waterType = waterType;
        this.temperature = temperature;
        this.lighting = lighting;
    }

    public Aquarium(Aquarium aq){
        this.tankID = aq.tankID;
        this.waterType = aq.waterType;
        this.temperature = aq.temperature;
        this.lighting = aq.lighting;
    }
}

