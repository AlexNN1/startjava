import java.util.Scanner;

public class CalculatorTest {
    public static void main (String[] args) {

        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter of mathematical operation: ");
        char operation = scan.next().charAt(0);

        double result1 = calculatorOne.calculate(num1, num2, operation);
        System.out.println(result1);
    }
}
