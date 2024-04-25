package day_4;

public class Main {
    public static void main(String[] args){
CalculatorWithMenu calculator = new CalculatorWithMenu();
boolean exit;
do {
    calculator.displayMenu();
    calculator.optionSelect();
    exit = calculator.optionSelect();
}while (exit);
    }
}
