import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char answer;
        do {
            System.out.println("First player enter name ");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Second player enter name ");

            Player player2 = new Player(scan.nextLine());

            GuessNumber guessNumber = new GuessNumber(player1, player2);

            guessNumber.play();

            while (true) {
                System.out.println("Do you want to continue? [y/n]");
                answer = scan.next().charAt(0);
                if (answer == 'y') {
                    break;
                }
                if (answer == 'n') {
                    break;
                }
            }
            if (answer == 'n') {
                break;
            }
        } while (true);
    }
}