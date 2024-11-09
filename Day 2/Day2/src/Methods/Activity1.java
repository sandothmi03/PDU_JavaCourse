package Methods;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        displayMessage();
        int n1 = getUserInput();
        int n2 = getUserInput();
        System.out.println(n1);
        System.out.println(n2);
    }
    static void displayMessage() {
        System.out.println("hello world");
    }
    static int getUserInput(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();
        return userInput;
    }
}
