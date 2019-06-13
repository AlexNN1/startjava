package com.startjava.Lesson_2_3_4.game;
class Player {

    private String name;
    private int number;

    Player(String name) {
        this.name = name;
        number = -1;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }
}
