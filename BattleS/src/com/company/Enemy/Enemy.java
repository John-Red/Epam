package com.company.Enemy;

import static com.company.TextColor.ANSI_RED;
import static com.company.TextColor.ANSI_RESET;

public abstract class Enemy {
    static boolean alive;
    static int healthPoint;
    static String name;
    static int dmg;

        public void damage (char damage) {
            switch (damage) {
                case ('w'):
                case ('W'):
                    healthPoint=healthPoint-3;
                    say("hurts");
                    System.out.println("HP противника : "+healthPoint);
                    break;
                case ('d'):
                case ('D'):
                    say("again");
                    break;
                case ('s'):
                case ('S'):
                    say("again");
                    break;
                case ('a'):
                case ('A'):
                    healthPoint=healthPoint-100;
                    say("hurts");
                    System.out.println("HP противника : "+healthPoint);
                    break;
                case ('m'):
                case ('M'):
                    say("MOM");
                    System.exit(0);
                default:
                    System.out.println(ANSI_RED +"неверный ход"+ ANSI_RESET);
                    break;
            }
        }
    public boolean stayingAlive(){
        if (healthPoint<1)
            alive=false;
        return alive;
    }
    protected abstract void say(String say);
    abstract void print();
    public int attac(){
        return dmg;
    }

}


