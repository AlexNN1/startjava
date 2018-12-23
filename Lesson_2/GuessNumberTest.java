import java.util.Scanner;
public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First player enter name ");
        Player p1 = new Player(scan.nextLine());
        System.out.println("Second player enter name ");
        Player p2 = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(p1, p2);

        guessNumber.play();
    }
}