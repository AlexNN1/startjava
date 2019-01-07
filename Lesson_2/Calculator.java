public class Calculator {

    int calculate(int num1, int num2, char operation) {

        int result = 0;
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
                if (num2 >= 0) {
                    if(num2 != 0) {
                        for (int i = 1; i <= num2; i++) {
                            result = 1;
                            result *= num1;
                        }
                    } else {
                        result = 1;
                    }
                } else {
                    System.out.println("Do not enter negative numbers!");
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("The operation symbol is not correctly entered");
        }
        return result;
    }
}