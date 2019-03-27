package com.startjava.Lesson_2_3.game;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int numberPC;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    private void checkPlayer(int number, String name) {
        if (number > numberPC) {
            System.out.println("Number player " + name + " > number PC");
        }
        if (number < numberPC) {
            System.out.println("Number player " + name + " < number PC");
        }
    }
    public void play() {
        numberPC = (int) (Math.random() * 101);
        
        while (true) {
            System.out.println("PC = " + numberPC);

            System.out.println("Player " + player1.getName() + " enter number ");
            player1.setNumber(scan.nextInt());
            checkPlayer(player1.getNumber(), player1.getName());
            if (player1.getNumber() == numberPC) {
                System.out.println("Player " + player1.getName() + " won");
                break;
            }
            System.out.println("Player " + player2.getName() + " enter number ");
            player2.setNumber(scan.nextInt());
            checkPlayer(player2.getNumber(), player2.getName());
            if (player2.getNumber() == numberPC) {
                System.out.println("Player " + player2.getName() + " won");
                break;
            }
        }
    }
}