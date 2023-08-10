package View;

import java.util.Scanner;

import Model.Calculator;
import Model.Calculator.InvalidInputException;
import Model.iCalculable;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int firstNumber = promptInt("Введите первое число: ");
            calculator.sum(firstNumber);
            
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, **, =) : ");
                if (cmd.equals("+")) {
                    int secondNumber = promptInt("Введите второе число: ");
                    calculator.sum(secondNumber);
                    continue;
                }
                
                if (cmd.equals("-")) {
                    int secondNumber = promptInt("Введите второе число: ");
                    calculator.subtract(secondNumber);
                    continue;
                }

                if (cmd.equals("*")) {
                    int secondNumber = promptInt("Введите второе число: ");
                    calculator.multi(secondNumber);
                    continue;
                }

                if (cmd.equals("/")) {
                    try{
                        int secondNumber = promptInt("Введите второе число: ");
                        calculator.division(secondNumber);
                        continue;
                    }catch (ArithmeticException e){
                        System.out.println("Произошла ошибка: " + e.getMessage());
                    }
                    break;
                }

                if (cmd.equals("**")) {
                    try
                    {
                        int secondNumber = promptInt("Введите второе число: ");
                        calculator.calculatePower(secondNumber);
                        continue;
                    } catch (InvalidInputException e){
                        System.out.println("Произошла ошибка: " + e.getMessage());
                    }
                    break;
                }

                if (cmd.equals("=")) {
                    int result = calculator.getResultReal();
                    System.out.println("Результат \n" + result);
                    break;
                }
            }
            // String cmd = prompt("Еще посчитать (Y/N)?");
            // if (cmd.equals("Y")) {
            //     continue;
            // }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}