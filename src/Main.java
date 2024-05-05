//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CalculatorApp {
    public CalculatorApp() {
    }

    public static void main(String[] args) {
        CalculatorApp obj = new CalculatorApp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator Application");

        boolean exit;
        do {
            System.out.println("Choose an operation:(*,+,/,-,%)");
            System.out.print("->");
            String input = sc.next();
            char ch = input.charAt(0);
            if (input.length() != 1) {
                System.out.println("wrong input please try again");
            } else {
                obj.chooseOperation(ch);
            }

            exit = obj.exitProgram();
        } while(!exit);

        System.out.println("Thanks for using our services");
    }

    public boolean exitProgram() {
        Scanner sc = new Scanner(System.in);
        int times = false;
        int retry = 5;
        int times = 0;

        while(times < retry) {
            System.out.println("Do you want to continue?(y/n) ");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);
            if (exitInput.length() != 1 || ch1 != 'n' && ch1 != 'N') {
                if (exitInput.length() != 1 || ch1 != 'y' && ch1 != 'Y') {
                    System.out.println("wrong input, please try again ");
                    ++times;
                    continue;
                }

                return false;
            }

            return true;
        }

        if (times >= retry) {
            System.out.println("Maximum retry count exceeded! Exiting forcefully");
            return true;
        } else {
            return false;
        }
    }

    public int getInteger() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public void chooseOperation(char ch) {
        switch (ch) {
            case '%':
                System.out.println("Enter num1 ->");
                int num9 = this.getInteger();
                System.out.println("Enter num2 ->");
                int num10 = this.getInteger();
                if (num10 == 0) {
                    System.out.println("Divide by 0 error");
                } else {
                    System.out.println("Modulo Result ->" + num9 % num10);
                }
                break;
            case '&':
            case '\'':
            case '(':
            case ')':
            case ',':
            case '.':
            default:
                System.out.println("Unknown operation");
                break;
            case '*':
                System.out.println("Enter num1 ->");
                int num1 = this.getInteger();
                System.out.println("Enter num2 ->");
                int num2 = this.getInteger();
                System.out.println("Multiply Result ->" + num1 * num2);
                break;
            case '+':
                System.out.println("Enter num1 ->");
                int num3 = this.getInteger();
                System.out.println("Enter num2 ->");
                int num4 = this.getInteger();
                System.out.println("Addition Result ->" + (num3 + num4));
                break;
            case '-':
                System.out.println("Enter num1 ->");
                int num5 = this.getInteger();
                System.out.println("Enter num2 ->");
                int num6 = this.getInteger();
                System.out.println("Subtraction Result ->" + (num5 - num6));
                break;
            case '/':
                System.out.println("Enter num1 ->");
                int num7 = this.getInteger();
                System.out.println("Enter num2 ->");
                int num8 = this.getInteger();
                if (num8 == 0) {
                    System.out.println("Divide by 0 error");
                } else {
                    System.out.println("Division Result ->" + num7 / num8);
                }
        }

    }
}
