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
                } else {
                    System.out.println("Do not enter negative numbers!");
                }
                break;
            case '%':
                double num1Percent = (double) num1;
                double num2Percent = (double) num2;
                result = (num1Percent / 100) * num2Percent;
                break;
            default:
                System.out.println("The operation symbol is not correctly entered");
        }
        return result;
    }
}
