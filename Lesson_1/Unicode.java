public class Unicode {
    public static void main (String[] args) {

        char code = '\u9398';
        for (int i = 0; i < 24; i++) {
            System.out.println(code + " ");
            for (int j = 0; j < 32; j++) {
                System.out.print(code + " ");
                code++;
            }
    }
}