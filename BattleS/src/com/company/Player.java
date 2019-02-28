package com.company;


public class Player {
    private int healthPoint = 15;

    public int getHealthPoint() {
        return this.healtPoint;
    }
   
    public void hurtHealth(int killValue) {
        this.healtPoint -= killValue;
    }

}
