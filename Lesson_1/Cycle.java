public class Cycle {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++){
            System.out.println("Число " + i);
        }

        System.out.println("\n");

        int i = 1;
        int result = 8;
        while(i < 8){
            result = result - 2;
            System.out.println("Число " + result);
            i++;
        }

        System.out.println("\n");

        int p = 1;
        int odd = 9;
        int sum = 0;
        do{
            odd = odd + 1;
            if(odd % 2 == 0){
                System.out.println("Число " + odd + " является четным");
                sum = sum + odd;
            }
            p++;
        }while(p < 12);
        
        System.out.println("Сумма чисел 10 + 12 + 14 + 16 + 18 + 20 = " + sum);
    }
}