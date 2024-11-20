package Exceptions.Activity1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int num1 = sc.nextInt();
        System.out.println("Enter number two");
        int num2 = sc.nextInt();
        int results = 0;
        try{results = num1/num2;
        } catch(ArithmeticException e){
            System.out.println("Dive by zero exception :" + e.getMessage());
        }System.out.println(results);
    }
}
