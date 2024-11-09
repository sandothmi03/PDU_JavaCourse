package Loops.While;

import java.util.Scanner;

public class Activity3_1 {
    public static void main(String[] args) {
        int i=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            if(n%2==0){
                System.out.println(i);
                i++;
            }
        }
    }
}
