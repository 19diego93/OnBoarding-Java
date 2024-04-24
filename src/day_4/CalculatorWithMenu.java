package day_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {

    private CalculatorOperations operations = new Calculator();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.println("""
                Select one option:
                1 = Addition,
                2 = Subtraction,
                3 = Multiplication,
                4 = Division,
                0 = Exit
                """);
    }

    @Override
    public boolean optionSelect() {
        int a;
        int b;
        int option;
        System.out.println("Enter your option");
        option = scanner.nextInt();
        switch(option){
            case 0:
                System.out.println("Loggin out system..");
                return false;
            case 1:
                System.out.println("first number");
                a=scanner.nextInt();
                System.out.println("second number");
                b=scanner.nextInt();
                System.out.println("Result: "+this.operations.addition(a,b));
                return true;

            case 2:
                System.out.println("first number");
                a=scanner.nextInt();
                System.out.println("second number");
                b=scanner.nextInt();
                System.out.println("Result: "+this.operations.subtraction(a,b));
                return true;

            case 3:
                System.out.println("first number");
                a=scanner.nextInt();
                System.out.println("second number");
                b=scanner.nextInt();
                System.out.println("Result: "+this.operations.multiplication(a,b));
                return true;

            case 4:
                System.out.println("first number");
                a=scanner.nextInt();
                System.out.println("second number");
                b=scanner.nextInt();
                System.out.println("Result: "+this.operations.division(a,b));
                return true;

            default:
                System.out.println("Try again, try a real option.");
                return true;
        }

    }


}
