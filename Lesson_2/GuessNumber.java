import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    Player p1;
    Player p2;
    int numberPC;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
       while (true) {
           boolean isWin = false;
           numberPC = (int) (Math.random() * 101);
           System.out.println("PC = " + numberPC);
           System.out.println("Player " + p1.getName() + " enter number ");
           p1.setNumber(scan.nextInt());
           System.out.println("Player " + p2.getName() + " enter number ");
           p2.setNumber(scan.nextInt());

           if (p1.getNumber() > numberPC) {
               System.out.println("Number player " + p1.getName() + " > number PC");
           }
           if (p2.getNumber() > numberPC) {
               System.out.println("Number player " + p2.getName() + " > number PC");
           }
           if (p1.getNumber() < numberPC) {
               System.out.println("Number player " + p1.getName() + " < number PC");
           }
           if (p2.getNumber() < numberPC) {
               System.out.println("Number player " + p2.getName() + " < number PC");
           }
           if (p1.getNumber() == numberPC) {
               isWin = true;
           } else {
               if (p2.getNumber() == numberPC)
                   isWin = true;
           }
           if (isWin) {
               if (p1.getNumber() == numberPC) {
                   System.out.println("Player " + p1.getName() + " won");
               }
               if (p2.getNumber() == numberPC) {
                   System.out.println("Player " + p2.getName() + " won");
               }
           }
           if (isWin) {
               break;
           }
       }
    }
}