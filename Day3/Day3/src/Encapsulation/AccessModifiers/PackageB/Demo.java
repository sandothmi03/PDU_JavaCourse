package Encapsulation.AccessModifiers.PackageB;

import Encapsulation.AccessModifiers.PackageA.A;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.age = 10;
        //a.name , a.email, a.mobile cannot access here. cus between deferent packages we only able to access to public ones. not private, protected and default.
    }
}
