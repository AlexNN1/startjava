public class Cycle {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++) {
            System.out.println("Number " + i);
        }

        System.out.println("------------------");

        int i = 6;
        while(i > -7) {
            System.out.println("Number " + i);
            i -= 2;
        }

        System.out.println("------------------");
        
        int p = 10;
        int sum = 0;
        do {
            if(p % 2 == 1) {
                System.out.println("Number " + p + " is odd");
                sum = sum + p;
            }
            p++;
        } while(p < 21);
        System.out.println("Sum number 11 + 13 + 15 + 17 + 19 = " + sum);
    }
}