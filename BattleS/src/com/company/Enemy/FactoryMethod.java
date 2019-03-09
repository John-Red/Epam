package com.company.Enemy;


public class FactoryMethod {
    public static Enemy getEnemy(int enemyCode) {
        Enemy enemy;
        switch (enemyCode) {
            case 0:
                enemy = new Catto();
                break;
            case 1:
                enemy = new Doggo();
                break;
            case 2:
                enemy = new Spoungebop();
                break;
            default:
                enemy = new BigChungus();
                break;
        }
        return enemy;
    }
}