package day_4;

public class Main {
    public static void main(String[] args){
CalculatorWithMenu calculator = new CalculatorWithMenu();
boolean exit;
do {
    calculator.displayMenu();
    exit = calculator.optionSelect();
}while (exit);
    }
}
