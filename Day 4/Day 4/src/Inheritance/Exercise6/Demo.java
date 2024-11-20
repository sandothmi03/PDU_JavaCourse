package Inheritance.Exercise6;

public class Demo {
    public static void main(String[] args) {
        AdvanceCalculator calc = new AdvanceCalculator();

        System.out.println("add " + calc.add( 10,20));
        System.out.println("substract " + calc.subtract(10,20));
        System.out.println("multiply " + calc.multiply(10,20));
        System.out.println("devide " + calc.divide(10,20));
        System.out.println("power " + calc.power(5,10));
        System.out.println("sqrt " + calc.sqrt(25));
    }
}
