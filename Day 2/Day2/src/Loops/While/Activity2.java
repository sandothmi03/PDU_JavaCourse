package Loops.While;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num < 10){
            System.out.println(num);
            num++;
        }
    }
}