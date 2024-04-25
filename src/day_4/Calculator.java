package day_4;

public class Calculator implements CalculatorOperations{
    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    public Calculator() {
    }
}
