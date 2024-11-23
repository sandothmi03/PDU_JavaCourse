package Exceptions.Activity2;

public class NICValidate {
    public static boolean validateNIC(String nic) throws NICValidationException {
        if(nic.length()!=10){
            throw new NICValidationException("NIC must be 10 digits");
        }
        return true;
    }
}
