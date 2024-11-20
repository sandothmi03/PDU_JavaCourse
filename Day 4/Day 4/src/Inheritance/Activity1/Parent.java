package Inheritance.Activity1;

public class Parent extends GrandParent {
    private String name;
    public void think(){
        System.out.println("Parent is thinking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}