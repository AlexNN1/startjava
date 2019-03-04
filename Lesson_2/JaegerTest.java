public class JaegerTest {
    public static void main(String[] args) {

        Jaeger jaeger = new Jaeger();

        System.out.println(jaeger.getMark());

        System.out.println(jaeger.getSpeed());
        jaeger.setSpeed(10);
        System.out.println(jaeger.getSpeed());
    }
}
