public class Calculator {

    int calculate(int num1, int num2, char operation) {

        int exponent = 1;
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
                if (num2 > 0) {
                    for (int i = 1; i <= num2; i++) {
                        exponent *= num1;
                    }
                }
                result = exponent;
                break;
            case '%':
                result = num1 % num2;
            default:
                System.out.println("The opertion symbol is not correctly entered, repeat input");
        }
        return result;
    }
}