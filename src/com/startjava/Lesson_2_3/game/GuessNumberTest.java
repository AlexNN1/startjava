import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player player1 = new Player();
        Player player2 = new Player();

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String answer;
        do {
            guessNumber.play();

            do {
                System.out.println("Do you want to continue? [yes/no]");
                answer = scan.nextLine();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
    }
}