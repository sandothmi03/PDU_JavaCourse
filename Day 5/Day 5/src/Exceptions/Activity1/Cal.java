package Exceptions.Activity1;

import Exceptions.Activity2.NICValidationException;

public class Cal {
    public static int dev(int a, int b) throws ArithmeticException {
        if(b==0){
            throw (new ArithmeticException("Y value was zero"));
        }
        return a/b;
    }

}

/*
public class Cal {
    public static int dev(int a, int b) throws Exception {
        if(b==0){
            throw (new Exception());
        }
        return a/b;
    }
}*/
