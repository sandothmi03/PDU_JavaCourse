package Encapsulation.AccessModifiers.PackageA;

// public, protected, private, default are access modifiers

public class A {
    public int age;
    private String name;
    protected String email;
    String mobile;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("age: " + age);
    }
}
