package com.company;

import com.company.Enemy.BigChungus;
import com.company.Enemy.BigShip;
import com.company.Enemy.MidShip;
import com.company.Enemy.SmallShip;

import java.util.Random;


import java.util.Scanner;

class Fight {


    public void New(int healthPoint) {
        int number;
        Random rnd = new Random(System.currentTimeMillis());
        number = rnd.nextInt(4);
        switch (number) {
            case 0:
                SmallShip enemy0 = new SmallShip();
                enemy0.SetPlace();


                do {
                    Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                    char ch = sc.next().charAt(0);
                    enemy0.Damage(ch);

                    if ((healthPoint < 1)) {
                        new GameOver();
                    }
                } while (enemy0.StayingAlive());
                break;


            case 1:
                MidShip enemy1 = new MidShip();
                enemy1.SetPlace();


                do {
                    Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                    char ch = sc.next().charAt(0);
                    enemy1.Damage(ch);
                    healthPoint = healthPoint - enemy1.Attac();
                    System.out.println("твои HP " + healthPoint);

                    if (healthPoint < 1) {
                        new GameOver();
                    }
                } while (enemy1.StayingAlive());
                break;


            case 2:
                BigShip enemy2 = new BigShip();
                enemy2.SetPlace();


                do {
                    Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                    char ch = sc.next().charAt(0);
                    enemy2.Damage(ch);
                    healthPoint = healthPoint - enemy2.Attac();
                    System.out.println("твои HP " + healthPoint);

                    if (healthPoint < 1) {
                        new GameOver();
                    }
                } while (enemy2.StayingAlive());
                break;


            default:
                BigChungus boss = new BigChungus();
                boss.SetPlace();


                do {
                    Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                    char ch = sc.next().charAt(0);
                    boss.Damage(ch);
                    healthPoint = healthPoint - boss.Attac();
                    System.out.println("твои HP " + healthPoint);

                    if (healthPoint < 1) {
                        new GameOver();
                    }
                } while (boss.StayingAlive());
                break;
        }
    }
}
