package Constructors;

public class Demo {
    public static void main(String[] args){
        Student s1;
        s1 = new Student();

        s1.display();
        s1.talk();
        s1.study();

        Student s2;
        s2 = new Student("Tae", 29, "tae@gmail.com");
        s2.display();

        Student s3;
        s3 = new Student("Jimin", 29, "jimin@gmail.com");
        s3.display();

        Student s4;
        s4 = new Student(s2);
        s4.display();




    }
}
