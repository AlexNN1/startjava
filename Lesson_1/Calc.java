class Calc {
    public static void main (String[] args) {

        int num1 = 3;
        int num2 = 3;
        char percent = '%';
        char exponentiation = '^';
        char sum = '+';
        char minus = '-';
        char multiplication = '*';
        char division = '/';
        int resultExponentiation = 1;

        char operation = division;

        if(operation == sum) {
            System.out.println("Result operation = " + (num1 + num2));
        }

        if(operation == percent) {
            double numDo1 = (double) num1;
            double numDo2 = (double) num2;
            System.out.println("Result operation = " + ((numDo1 * numDo2)/100));
        }

        if(operation == exponentiation) {
            for (int i = 1; i <= num2; i++) {
                resultExponentiation = resultExponentiation * num1;
            }
        }        
        if(operation == exponentiation) {
            System.out.println("Result operation = " + resultExponentiation);
        }

        if(operation == minus) {
            System.out.println("Result operation = " + (num1 - num2));
        }

        if(operation == multiplication) {
            System.out.println("Result operation = " + (num1 * num2));
        }

        if(operation == division) {
            System.out.println("Result operation = " + (num1 / num2));
        }
    }
}