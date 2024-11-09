package All;

import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = Integer.parseInt(sc.nextLine());
        boolean isPrime = true;
        for (int i=2; i<=n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        }else{
            System.out.println(n + " is not a Prime number.");
        }
    }
}
