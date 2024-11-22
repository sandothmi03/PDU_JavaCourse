import java.util.Scanner;

public class Student {

    private String name;
    private String email;
    private int age;
    private String address;
    private int mark;

    public Student(String name, String email, int age, String address, int mark) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.mark = mark;
    }

    public void obtainDetails(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = in.nextLine();

        System.out.print("Enter student email: ");
        email = in.nextLine();

        System.out.print("Enter student age: ");
        age = in.nextInt();

        System.out.print("Enter student address: ");
        address = in.nextLine();

        System.out.println("Enter student mark: ");
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
        System.out.println("Student Details\n");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Mark: " + mark);
        System.out.println("Student Grade: " + calculateGrades());
    }

}
