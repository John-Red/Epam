package com.company;


public class Player {

    private int healthPoint =15;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void hurtHealth(int killValue) {
        healthPoint -= killValue;
    }

    public void healHealth(int healValue) {
        healthPoint += healValue;
    }

}
