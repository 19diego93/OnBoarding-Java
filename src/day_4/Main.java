package day_4;

public class Main {
    public static void main(String[] args){
CalculatorWithMenu calculator = new CalculatorWithMenu();
boolean aux;
do {
    calculator.displayMenu();
    calculator.optionSelect();
    aux = calculator.optionSelect();
}while (aux);
    }
}
