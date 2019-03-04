import java.util.Scanner;

public class GuessNumber {

    private Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int numberPC;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        numberPC = (int) (Math.random() * 101);
    }

    public void play() {
        while (true) {
            System.out.println("PC = " + numberPC);
            System.out.println("Player " + player1.getName() + " enter number ");
            player1.setNumber(scan.nextInt());
            System.out.println("Player " + player2.getName() + " enter number ");
            player2.setNumber(scan.nextInt());

            if (player1.getNumber() > numberPC) {
                System.out.println("Number player " + player1.getName() + " > number PC");
            }
            if (player2.getNumber() > numberPC) {
                System.out.println("Number player " + player2.getName() + " > number PC");
            }
            if (player1.getNumber() < numberPC) {
                System.out.println("Number player " + player1.getName() + " < number PC");
            }
            if (player2.getNumber() < numberPC) {
                System.out.println("Number player " + player2.getName() + " < number PC");
            }
            if (player1.getNumber() == numberPC) {
                System.out.println("Player " + player1.getName() + " won");
                break;
            } else {
                if (player2.getNumber() == numberPC) {
                    System.out.println("Player " + player2.getName() + " won");
                    break;
                }
            }
        }
    }
}