public class Player {

    void numPlayer(int n) {

        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);

        while (true) {
            if (num1 > n) {
                System.out.println("Number Player1 high number PC");
                System.out.println("Player1 = " + num1);
                num1--;
            } if (num2 > n) {
                System.out.println("Number Player2 high number PC");
                System.out.println("Player2 = " + num2);
                num1--;
            } if (num1 < n) {
                System.out.println("Number Player1 down number PC");
                System.out.println("Player1 = " + num1);
                num1++;
            } if (num2 < n) {
                System.out.println("Number Player2 down number PC");
                System.out.println("Player2 = " + num2);
                num1++;
            } if (num1 == n) {
                System.out.println("Player1 won");
                System.out.println("Player1 = " + num1);
                break;
            } if (num2 == n) {
                System.out.println("Player2 won");
                System.out.println("Player2 = " + num2);
                break;
            }
        }
    }
}
