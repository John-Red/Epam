package com.company;

import com.company.Enemy.BigChungus;
import com.company.Enemy.Catto;
import com.company.Enemy.Doggo;
import com.company.Enemy.Spoungebop;

import java.util.Random;


import java.util.Scanner;

class Fight {
    private Player player;

    Fight(){
        this.player= new Player();
    }

    void start() {
        int number;
        Random rnd = new Random(System.currentTimeMillis());
        number = rnd.nextInt(4);
        switch (number) {
            case 0:
                playerVsCatto();
                break;
            case 1:
                playerVsDoggo();
                break;
            case 2:
                playerVsSpoungebop();
                break;
            default:
                playerVsChunga();
                break;
        }
    }

    private void playerVsCatto (){
        Catto enemy0 = new Catto();
        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
            char ch = sc.next().charAt(0);
            enemy0.damage(ch);

            if ((player.healthPoint < 1)) {
                new GameOver();
            }
        } while (enemy0.stayingAlive());
    }
    private void playerVsDoggo (){
        Doggo enemy1 = new Doggo();

        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
            char ch = sc.next().charAt(0);
            enemy1.damage(ch);
            Player.healthPoint = player.healthPoint - enemy1.attac();
            System.out.println("твои HP " + player.healthPoint);

            if (player.healthPoint < 1) {
                new GameOver();
            }
        } while (enemy1.stayingAlive());
    }
    private void playerVsSpoungebop (){
        Spoungebop enemy2 = new Spoungebop();

        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
            char ch = sc.next().charAt(0);
            enemy2.damage(ch);
            player.healthPoint = player.healthPoint - enemy2.attac();
            System.out.println("твои HP " + player.healthPoint);

            if (player.healthPoint < 1) {
                new GameOver();
            }
        } while (enemy2.stayingAlive());
    }
    private void playerVsChunga (){
        BigChungus boss = new BigChungus();
        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
            char ch = sc.next().charAt(0);
            boss.damage(ch);
            player.healthPoint = player.healthPoint - boss.attac();
            System.out.println("твои HP " + player.healthPoint);

            if (player.healthPoint < 1) {
                new GameOver();
            }
        } while (boss.stayingAlive());
    }
}
