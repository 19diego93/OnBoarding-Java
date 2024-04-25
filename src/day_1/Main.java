package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello pibardo!");
        // 1
/*
        String firstName = "Diego";
        String lastName = "Vallejo";
        short age = 31;
        String salute = "Hello my name is " + firstName + " " + lastName + " and I'm " + age + " years old!!";
*/
        //System.out.println(salute);

        //2
        //salutePrinter(salute);

        //3
        //numberComparator(15,22,3);

        //4
        //numberDiscriminator(678);

        //5
        /*
        Scanner stringComparat = new Scanner(System.in);
        System.out.println("Write first string:");
        String string1 = stringComparat.next();
        System.out.println("Write second string:");
        String string2 = stringComparat.next();
        stringComparator(string1,string2);
        */
        //6
        //maybePrime(thePrime(307));

        //7
        int[] arrayNum = {3, 7, 0, 12, 9, 2, 1, 11};

        //findTheOdd(arrayNum);

        //8
        //findTheEven(arrayNum);

        //9 + 10(modificacion division por 0)
        //theCalculator();

        //11
        //bowlingAlley();

        //12
        bowlingAlleyVip();
    }

    //
    static void salutePrinter(String param) {
        System.out.println(param);
    }

    //
    static void numberComparator(int param1, int param2, int param3) {
        if ((param1 - param2 - param3) > 0) {
            System.out.println("this is the bigger number: " + param1);
        } else if ((param2 - param1 - param3) > 0) {
            System.out.println("this is the bigger number: " + param2);
        } else {
            System.out.println("this is the bigger number: " + param3);
        }
    }

    //
    static void numberDiscriminator(int a) {
        if (a % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        }
    }

    //
    static void stringComparator(String param1, String param2) {
        if (param1.equals(param2)) {
            System.out.println(("Equals!!"));
        } else {
            System.out.println(("Are not equals!!"));
        }
    }

    //
    static boolean thePrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        //loop que se activa en caso de que el numero no sea divisible por 2 o 3
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    static void maybePrime(boolean prime) {
        if (prime) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }

    //
    static void findTheOdd(int[] numbers) {
        int aux = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                aux += numbers[i];
            }
        }
        System.out.println(aux);
    }

    //
    static void findTheEven(int[] numbers) {
        int even = 0;
        int thePrimes = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i];
            }
            if (thePrime(numbers[i])) {
                thePrimes += numbers[i];
            }
        }
        System.out.println("even Sum: " + even);
        System.out.println("prime Sum: " + thePrimes);
    }

    //
    static void theCalculator() {
        int exit;
        Scanner calculate = new Scanner(System.in);
        System.out.println("add your numbers and choose the operation");
        System.out.println("addition = 1");
        System.out.println("subtraction = 2");
        System.out.println("multiplication = 3");
        System.out.println("division = 4");


        do {
            System.out.println("Write first number:");
            int number1 = Integer.parseInt(calculate.next());
            System.out.println("Write second number:");
            int number2 = Integer.parseInt(calculate.next());
            System.out.println("choose +=1 , -=2 , *=3 , /=4  ");
            int operation = Integer.parseInt(calculate.next());

            switch (operation) {
                case 1:
                    addition(number1, number2);
                    break;
                case 2:
                    subtraction(number1, number2);
                    break;
                case 3:
                    multiplication(number1, number2);
                    break;
                case 4:
                    if (number2 == 0) {
                        System.out.println("Can not divide by 0!!");
                    } else {
                        division(number1, number2);
                    }
                    break;
                default:
                    System.out.println("Try again!");
            }
            System.out.println("want to exit calculator?  => 0");
            exit = calculate.nextInt();
        } while (exit != 0);

    }

    static void addition(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    static void subtraction(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    static void multiplication(int a, int b) {
        System.out.println("Result: " + (a * b));
    }

    static void division(int a, int b) {
        System.out.println("Result: " + (a / b));
    }

    //12
    static void bowlingAlleyVip() {
        int maxCap = 500;
        int freeSpace = 500;
        int entrance = 1500;
        int vipEntrance = 2000;
        String name = "";
        int age = 0;
        String id = "";
        String pass;


        int bank = 0;
        int cashIn;
        int option;
        Scanner bowllingSystem = new Scanner(System.in);

        do {
            System.out.println("Person data entry = 1 - Available capacity = 2 - Money raised = 3 - Log out system = 4");
            System.out.println("Choose one option (1-4)");
            option = Integer.parseInt(bowllingSystem.next());

            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    name = bowllingSystem.next();
                    System.out.println("Age: ");
                    age = bowllingSystem.nextInt();
                    bowllingSystem.nextLine();
                    System.out.println("ID: ");
                    id = bowllingSystem.next();
                    bowllingSystem.nextLine();
                    System.out.println("Has pass? vip/discount/no");
                    pass = bowllingSystem.next().toLowerCase();

                    if (age >= 21) {
                        System.out.println("Allowed to enter");
                        if ("vip".equals(pass)) {
                            System.out.println("free enter");
                            if (freeSpace > 0) {
                                freeSpace --;
                                System.out.println("Welcome " + name);
                            } else {
                                System.out.println("Add to wait list");
                            }
                        } else if (pass.equals("discount")) {
                            System.out.println("Do you want to buy a pass");
                            bowllingSystem.nextLine();
                            if (bowllingSystem.next().equals("yes")) {
                                System.out.println("Do you want to buy vip or normal pass");
                                bowllingSystem.nextLine();
                                if (bowllingSystem.next().toLowerCase().equals("vip")) {
                                    System.out.println("Applying discount of 50%");
                                    bank += vipEntrance / 2;
                                    if (freeSpace > 0) {
                                        freeSpace --;
                                        System.out.println("Welcome " + name);
                                    } else {
                                        System.out.println(name + " added to wait list");
                                    }

                                } else if (bowllingSystem.next().toLowerCase().equals("normal")) {
                                    System.out.println("Applying discount of 50%");
                                    bank = entrance / 2;
                                    if (freeSpace > 0) {
                                        freeSpace --;
                                        System.out.println("Welcome " + name);
                                    } else {
                                        System.out.println("Add to wait list");
                                    }
                                }
                            } else {
                                System.out.println("Good bye " + name + "!");
                            }
                        } else {
                            System.out.println("Do you want to buy a pass");
                            if (bowllingSystem.next().toLowerCase().equals("yes")) {
                                System.out.println("Do you want to buy vip or normal pass");
                                bowllingSystem.nextLine();
                                if (bowllingSystem.next().toLowerCase().equals("vip")) {
                                    System.out.println("vip sold");
                                    bank += vipEntrance;
                                    if (freeSpace > 0) {
                                        freeSpace --;
                                        System.out.println("Welcome " + name);
                                    } else {
                                        System.out.println(name + " added to wait list");
                                    }

                                } else if (bowllingSystem.next().toLowerCase().equals("normal")) {
                                    System.out.println("normal sold");
                                    bank = entrance;
                                    if (freeSpace > 0) {
                                        freeSpace --;
                                        System.out.println("Welcome " + name);
                                    } else {
                                        System.out.println("Add to wait list");
                                    }
                                }
                            }else{System.out.println("Good bye " + name + "!");}
                        }

                    } else {
                        System.out.println("Not allowed to enter");
                    }
                    break;
                case 2:
                    System.out.println("Available capacity: " + freeSpace);
                    break;
                case 3:
                    System.out.println("Money raised: " + bank);
                    break;
                case 4:
                    System.out.println(" Logging out of the system");
                    break;
                default:
                    System.out.println("please select an option!");
            }
        } while (option != 4);

    }


}