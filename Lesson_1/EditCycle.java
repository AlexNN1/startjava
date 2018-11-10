public class Cycle {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++){
            System.out.println("Число " + i);
        }
        System.out.println("\n");
        int i = 6;
        while(i > -7){
            System.out.println("Число " + i);
            i--;
            i--;
        }
        System.out.println("\n");
        int p = 10;
        int sum = 0;
        do{
            if(p % 2 == 1){
                System.out.println("Число " + p + " является нечетным");
                sum = sum + p;
            }
            p++;
        }while(p < 21);
        System.out.println("Сумма чисел 11 + 13 + 15 + 17 + 19 = " + sum);
    }
}