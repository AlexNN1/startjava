package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger jaegerAvenger = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77f, 2.004f, 14, 12, 18);
        Jaeger jaegerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.20f, 1.850f, 10, 10, 10);

        System.out.println(jaegerAvenger.getModelName());
        System.out.println(jaegerAvenger.getMark());
        System.out.println(jaegerAvenger.getSpeed());
        jaegerAvenger.setSpeed(10);
        System.out.println(jaegerAvenger.getSpeed());

        System.out.println(jaegerEureka.getModelName());
        System.out.println((jaegerEureka.getMark()));
        System.out.println(jaegerEureka.getSpeed());
        jaegerEureka.setSpeed(28);
        System.out.println(jaegerEureka.getSpeed());
    }
}
