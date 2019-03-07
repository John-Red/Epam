package com.company;
import com.company.Enemy.*;
import java.util.Random;
import java.util.Scanner;


class Fight {
    private Player player;
    private int level;
    private Catto catto;
    private Doggo doggo;
    private Spoungebop spoungebop;
    private BigChungus bigChungus;
    private Enemy enemy;

    Fight(Player player, int level) {
        this.player = player;
        this.level = level;
    }

    void start() {
        int number;
        Random rnd = new Random(System.currentTimeMillis());
        number = rnd.nextInt(4);
        switch (number) {
            case 0:
                this.catto=new Catto();
                this.enemy=this.catto;
                break;
            case 1:
                this.doggo=new Doggo();
                this.enemy=this.doggo;
                break;
            case 2:
                this.spoungebop=new Spoungebop();
                this.enemy=this.spoungebop;
                break;
            default:
                this.bigChungus=new BigChungus();
                this.enemy=this.bigChungus;
                break;
        }
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
// NEW BRANCH
}
