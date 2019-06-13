package com.startjava.Lesson_1.calculator;

class Calc {
    public static void main (String[] args) {

        int num1 = 3;
        int num2 = 3;
        int resultExponentiation = 1;

        char operation = '/';

        if(operation == '+') {
            System.out.println("Result operation = " + (num1 + num2));
        }

        if(operation == '%') {
            double numDo1 = (double) num1;
            double numDo2 = (double) num2;
            System.out.println("Result operation = " + (numDo1 % numDo2));
        }

        if(operation == '^') {
            for (int i = 1; i <= num2; i++) {
                resultExponentiation *= num1;
            }
        }
        if(operation == '^') {
            System.out.println("Result operation = " + resultExponentiation);
        }

        if(operation == '-') {
            System.out.println("Result operation = " + (num1 - num2));
        }

        if(operation == '*') {
            System.out.println("Result operation = " + (num1 * num2));
        }

        if(operation == '/') {
            double numDo1 = (double) num1;
            double numDo2 = (double) num2;
            System.out.println("Result operation = " + (numDo1 / numDo2));
        }
    }
}