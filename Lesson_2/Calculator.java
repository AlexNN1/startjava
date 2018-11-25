public class Calculator {

    double calculate(int num1, int num2, char operation) {

        double result = 1;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                if (num2 > 0) {
                    for (int i = 1; i <= num2; i++) {
                        result *= num1;
                    }
                }
                break;
            case '%':
                double num1Percent = (double) num1;
                double num2Percent = (double) num2;
                result = num1Percent * num2Percent / 100;
                break;
            default:
                System.out.println("The opertion symbol is not correctly entered, repeat input");
        }
        return result;
    }
}