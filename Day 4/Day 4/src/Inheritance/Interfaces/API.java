package Inheritance.Interfaces;

public class API implements A,B{
    public void a(){
        System.out.println("Method a");
    }

    @Override
    public void b() {

    }

    public void a(String a){
        System.out.println("Method a");
    }

}
