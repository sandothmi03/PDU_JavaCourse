import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private String email;
    private String address;
    private int mark;

    public Student(){

    }

    public Student(String name, int age, String email, String address, int mark) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.mark = mark;
    }

    public void obtainDetails(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = in.nextLine();

        System.out.print("Enter student age: ");
        age = in.nextInt();
        in.nextLine();

        System.out.print("Enter student email: ");
        email = in.nextLine();

        System.out.print("Enter student address: ");
        address = in.nextLine();

        System.out.print("Enter student mark: ");
        mark = in.nextInt();
    }

    public String calculateGrades(){
        if(mark>=90){
            return "A";
        }else if(mark>=80){
            return "B";
        }else if(mark>=70){
            return "C";
        }else if(mark>=60){
            return "D";
        }else{
            return "F";
        }
    }

    public void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Mark: " + mark);
        System.out.println("Student Grade: " + calculateGrades());
    }

}
