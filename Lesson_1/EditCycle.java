public class Cycle {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++){
            System.out.println("����� " + i);
        }
        System.out.println("\n");
        int i = 6;
        while(i > -7){
            System.out.println("����� " + i);
            i--;
            i--;
        }
        System.out.println("\n");
        int p = 10;
        int sum = 0;
        do{
            if(p % 2 == 1){
                System.out.println("����� " + p + " �������� ��������");
                sum = sum + p;
            }
            p++;
        }while(p < 21);
        System.out.println("����� ����� 11 + 13 + 15 + 17 + 19 = " + sum);
    }
}