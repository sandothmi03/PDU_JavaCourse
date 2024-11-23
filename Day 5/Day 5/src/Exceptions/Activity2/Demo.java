package Exceptions.Activity2;

import Exceptions.Activity1.Cal;

public class Demo {
    public static void main(String[] args) throws NICValidationException{
        NICValidate.validateNIC("123456789");
    }
}
