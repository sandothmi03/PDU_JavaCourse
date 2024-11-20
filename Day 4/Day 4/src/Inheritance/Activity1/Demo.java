package Inheritance.Activity1;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setName("saman");
        parent.think();
        parent.wisdom();


        Child child = new Child();
        child.setEmail("rrg");
        child.setName("saman");
        child.think();
        child.wisdom();
        child.setSurname("hettige");
    }
}