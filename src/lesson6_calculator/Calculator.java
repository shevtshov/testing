package lesson6_calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Sum ");
            System.out.println("2. Div");
            System.out.println("3. Multiply");
            System.out.println("4. Subtraction");
            System.out.println("0. Exit");

            Scanner myObj = new Scanner(System.in);  // Create a object that can read user input
            String menuItem = myObj.nextLine();  // Read user input
            System.out.println("Menu item is: " + menuItem);  // Output user

            if (menuItem.contains("0") || menuItem.contains("exit")) {
                System.out.println("Bye-bye!");
                break;
            }

            switch (menuItem) {
                case "1":
                    System.out.println("Введите первое число: ");
                    int firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    int secondNumber = myObj.nextInt();
                    System.out.println("Result of sum: " + sum(firstNumber, secondNumber));
                    break;
                case "2":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of Div: " + div(firstNumber, secondNumber));
                    break;
                case "3":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of Multiply: " + multiply(firstNumber, secondNumber));
                    break;
                case "4":
                    System.out.println("Введите первое число: ");
                    firstNumber = myObj.nextInt();
                    System.out.println("Введите второе число: ");
                    secondNumber = myObj.nextInt();
                    System.out.println("Result of Subtraction: " + subtraction(firstNumber, secondNumber));
                    break;
            }
        }
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}