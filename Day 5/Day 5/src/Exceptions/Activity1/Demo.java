package Exceptions.Activity1;

public class Demo {
    public static void main(String[] args) {
        try{
            Cal.dev(20,0);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
