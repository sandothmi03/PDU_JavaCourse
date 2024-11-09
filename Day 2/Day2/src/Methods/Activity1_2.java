package Methods;

import java.util.Scanner;

public class Activity1_2 {
    public static void main(String[] args) {
        int n1 = getUserInput("Enter an even number: ");
        int n2 = getUserInput("Enter an odd number: ");
        int sum = getSum(n1, n2);
        System.out.println("Sum of the two numbers is: " + sum);
    }
    static int getUserInput(String number){
        Scanner sc = new Scanner(System.in);
        System.out.println(number);
        int userInput = sc.nextInt();
        return userInput;
    }
    static int getSum(int a , int b){
        int sum = a+b;
        return a+b;
    }
}
