package com.startjava.Lesson_2_3.game;
public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
        number = -1;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public  void setNumber(int number) {
        this.number = number;
    }
}
