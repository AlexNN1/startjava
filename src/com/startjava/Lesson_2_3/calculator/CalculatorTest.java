package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        char answer;

        do {
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter of mathematical operation: ");
            char operation = scan.next().charAt(0);

            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();

            int result = calculator.calculate(num1, num2, operation);
            System.out.println(result);

            while (true) {
                System.out.println("Want to continue? [y/n]");
                answer = scan.next().charAt(0);
                if (answer == 'y') {
                    break;
                }
                if (answer == 'n') {
                    break;
                }
            }
            if (answer == 'n') {
                break;
            }
        } while (true);
    }
}