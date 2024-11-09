package Encapsulation.AccessModifiers.PackageA;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.age = 10;
        a.email = "hafhk";
        a.mobile = "samsung";
        //a.name = "ef"; we are not able to do that cuz name is private. so it only have access to the same class.
    }
}
