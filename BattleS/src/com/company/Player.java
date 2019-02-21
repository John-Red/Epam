package com.company;


public class Player {
    static int healthPoint;
    private boolean alive;

    Player() {
        this.healthPoint = 15;
        this.alive = true;

    }

    public int getHealthPoint() {
        return healthPoint;
    }

}
