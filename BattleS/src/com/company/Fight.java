package com.company;
import com.company.Enemy.*;
import java.util.Random;
import java.util.Scanner;


class Fight {
    private Player player;
    private int level;
     private Enemy enemy;

    Fight(Player player, int level) {
        this.player = player;
        this.level = level;
    }

    void start() {
        int number;
        Random rnd = new Random(System.currentTimeMillis());
        number = rnd.nextInt(4);
        this.enemy= FactoryMethod.getEnemy(number);
        battle(this.enemy);
    }

    private void battle(Enemy enemy) {

        do {
            char ch = GetChar.Char();
            enemy.takeDamage(ch);
            player.hurtHealth(enemy.attac());
            System.out.println("твои HP " + player.getHealthPoint());

            if (player.getHealthPoint() < 1) {
                new GameOver();
            }
        } while (enemy.isAlive());
    }

}
