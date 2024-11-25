import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data for a student");
            System.out.println("2. Display student details and grade");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nChoose a student to input data:");
                    System.out.println("1. Student 1");
                    System.out.println("2. Student 2");
                    System.out.println("3. Student 3");
                    System.out.println("4. Student 4");
                    System.out.println("5. Student 5");
                    System.out.print("Enter your choice: ");
                    int studentChoice = sc.nextInt();
                    sc.nextLine();

                    switch (studentChoice) {
                        case 1:
                            System.out.println("Enter details for Student 1: ");
                            st1.obtainDetails();
                            break;
                        case 2:
                            System.out.println("Enter details for Student 2: ");
                            st2.obtainDetails();
                            break;
                        case 3:
                            System.out.println("Enter details for Student 3: ");
                            st3.obtainDetails();
                            break;
                        case 4:
                            System.out.println("Enter details for Student 4: ");
                            st4.obtainDetails();
                            break;
                        case 5:
                            System.out.println("Enter details for Student 5: ");
                            st5.obtainDetails();
                            break;
                        default:
                            System.out.println("Invalid student choice.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nChoose a student to display details:");
                    System.out.println("1. Student 1");
                    System.out.println("2. Student 2");
                    System.out.println("3. Student 3");
                    System.out.println("4. Student 4");
                    System.out.println("5. Student 5");
                    System.out.print("Enter your choice: ");
                    studentChoice = sc.nextInt();

                    switch (studentChoice) {
                        case 1:
                            st1.displayStudentDetails();
                            break;
                        case 2:
                            st2.displayStudentDetails();
                            break;
                        case 3:
                            st3.displayStudentDetails();
                            break;
                        case 4:
                            st4.displayStudentDetails();
                            break;
                        case 5:
                            st5.displayStudentDetails();
                            break;
                        default:
                            System.out.println("Invalid student choice.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nExit");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}
