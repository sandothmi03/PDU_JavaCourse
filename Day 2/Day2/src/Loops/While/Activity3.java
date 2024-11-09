package Loops.While;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        while ( num < 10){
            num++;
            if (num % 2 == 0){
                System.out.println(num);
            }
        }

    }
}
