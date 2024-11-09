package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Activity1_1 {
    public static void main(String[] args) {
        int n1 = getUserInput("Enter an even number: ");
        int n2 = getUserInput("Enter an odd number: ");
        sum(n1,n2);
    }
    static int getUserInput(String number){
        Scanner sc = new Scanner(System.in);
        System.out.println(number);
        int userInput = sc.nextInt();
        return userInput;
    }
    static int sum(int a , int b){
        System.out.println(a+b);
        return a+b;
    }
}
