public class GuessNumber {

    int numPc() {
        int n = (int) (Math.random() * 101);
        System.out.println("PC = " + n);
        return n;
    }
}
