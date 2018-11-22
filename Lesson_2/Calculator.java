public class Calculator {

    int calculate(int num1, int num2, char operations) {
        int num3 = num1;
        int num4 = num2;
        char operation = operations;

        int expo = 1;
        int result = 0;
        switch (operation) {
            case '+':
                result = num3 + num2;
                break;
            case '-':
                result = num3 - num2;
                break;
            case '*':
                result = num3 * num2;
                break;
            case '/':
                result = num3 / num2;
                break;
            case '^':
                if (num2 > 0) {
                    for (int i = 1; i <= num2; i++) {
                        expo *= num3;
                    }
                }
                result = expo;
                break;
            case '%':
                result = num3 % num2;
            default:
//                КодВыбораПоУмолчанию;
                break;
        }
        return result;
    }
}