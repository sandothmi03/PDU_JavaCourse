package Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(("://abc.txt")));
            System.out.println("Hi I opened a file");
        }catch(IOException e){
            System.out.println("Exception caught" + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception is happened" + e.getMessage());
        }finally{
            System.out.println("This is the finally block");
        }
        System.out.println("Hi I am continuing now");

    }
        /*display("hI");*/

}
    /*public static void display(String message){
        display(message);
    }*/

