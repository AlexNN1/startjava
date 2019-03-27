package com.startjava.Lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First player enter name ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Second player enter name ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String answer;
        do {
            guessNumber.play();

            do {
                System.out.println("Do you want to continue? [yes/no]");
                answer = scan.nextLine();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));

        } while (answer.equals("yes"));
    }
}