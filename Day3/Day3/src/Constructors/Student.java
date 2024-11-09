package Constructors;

public class Student {
    public String name;
    public int age;
    public String email;

    public Student(){
        this.name = "JungKook";
        this.age = 27;
        this.email = "jk@gmail.com";
        System.out.println(name + " This is the default constructor ");
    }
    public Student(String name, int age, String email){
        System.out.println(name + " This is the parameterized constructor");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(Student stu1){ //copy constructor and here (stu1) is a reference so we can use any of those reference for it.
        this.name = stu1.name;
        this.age = stu1.age;
        this.email = stu1.email;
        System.out.println(this.name + " This is the copy constructor");
    }

    public void talk(){
        System.out.println(this.name + " is talking");
    }
    public void study(){
        System.out.println(this.name + " is studying");
    }
    public void display(){
        System.out.println("Name :" + this.name);
        System.out.println("Age :" + this.age);
        System.out.println("Email :" + this.email);
    }
}
