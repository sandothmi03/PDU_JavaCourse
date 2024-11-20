package Polymorphism.MethodOverloading;

public class Methods {

    public void display(){
        System.out.println("sum");
    }
    public void display(int a){
        System.out.println(a);
    }
    public void display(String a){
        System.out.println(a);
    }
    public void display(int a,int b){
        System.out.println(a+b);
    }
    public void display(int a,String b){
        System.out.println(a+b);
    }
    public void display(String b, int a){
        System.out.println(b+a);
    }
}
