package Loops.BreakContinue;

public class Activity1 {
    public static void main(String[] args) {
        for(int i=1;i<=15;i++) {
            if(i%2==0){
                continue;
            }
            if(i==13){
                break;
            }
            System.out.println(i);
        }
    }
}
