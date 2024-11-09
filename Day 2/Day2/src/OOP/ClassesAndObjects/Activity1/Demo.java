package OOP.ClassesAndObjects.Activity1;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.age = 21;
        person.name = "Gihanga";
        System.out.println(person.age);
        System.out.println(person.name);
        person.walk();
        person.talk();

        person2.age = 20;
        person2.name = "Sandothmi";
        System.out.println(person2.age);
        System.out.println(person2.name);
        person2.walk();
        person2.talk();
    }
}
