package Methods;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int n1 = getUserInput("Enter a number: ");
        int n2 = getUserInput("Enter a number: ");
        //addition(n1,n2);
        //System.out.println("Addition of two numbers is: " + addition(n1,n2));
        //subtraction(n1,n2);
        //System.out.println("Subtraction of two numbers is: " + subtraction(n1,n2));
        //multiplication(n1,n2);
        //System.out.println("Multiplication of two numbers is: " + multiplication(n1,n2));
        //division(n1,n2);
        //System.out.println("Division of two numbers is: " + division(n1,n2));

        String operator = getUserOperator("Input operator: ");
        switch (operator) {
            case "+" : {
                System.out.println("Addition of two numbers is: " + addition(n1,n2));
                break;
            }
            case "-" : {
                System.out.println("Subtraction of two numbers is: " + subtraction(n1,n2));
                break;
            }
            case "*" :{
                System.out.println("Multiplication of two numbers is: " + multiplication(n1,n2));
                break;
            }
            case "/" :{
                System.out.println("Division of two numbers is: " + division(n1,n2));
                break;
            }
        }

    }
    static int getUserInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int userInput = sc.nextInt();
        return userInput;
    }
    static String getUserOperator(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String userInput = sc.nextLine();
        return userInput;
    }
    static int addition(int a, int b){
        int add = a + b;
        return add;
    }
    static int subtraction(int a, int b){
        int sub = a - b;
        return sub;
    }
    static int multiplication(int a, int b){
        int multi = a*b;
        return multi;
    }
    static int division(int a, int b){
        int div = a/b;
        return div;
    }
}
