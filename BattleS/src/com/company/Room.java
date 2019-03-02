package com.company;

import java.util.Random;

import static com.company.TextColor.*;



public class Room {
    private Random rnd = new Random(System.currentTimeMillis());
    private Player player;
    private int level;
    private int luck= 20;
    private Fight newFight;

    Room(Player player,int level){
        this.player=player;
        this.level=level;
        this.newFight= new Fight(player,level);
    }
    void openNewRoom() {
        int number = rnd.nextInt(99);
        if (number <= this.luck) {
            newFight.start();
        } else {
            if (number >= (100 - this.luck*2/3)) {
                healPlayer(10);
            } else {
                System.out.println(ANSI_RED + "сектор чист" + ANSI_RESET);
            }
        }
    }
    private void healPlayer(int plus) {
        player.healHealth(plus);
        System.out.println(ANSI_YELLOW + "вы нашли шпинат -- HP +"+plus + ANSI_RESET);
    }
}
