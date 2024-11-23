package Exceptions.Activity2;

public class NICValidationException extends Exception{
    public NICValidationException(){
    }
    public NICValidationException(String message){
        super(message);
    }
}
