package com.company;

import java.util.Random;

import static com.company.TextColor.*;

public class Board {

    private int up;
    private int right;
    int yourX;
    int yourY;
    private int exitX;
    private int exitY;
    int luck;
    Player newPlayer;


    Board() {
        Random rnd = new Random(System.currentTimeMillis());
        this.up = rnd.nextInt(15) + 5;
        this.right = rnd.nextInt(15) + 5;
        this.yourX = right / 2 + 1;
        this.yourY = up / 2 + 1;
        this.exitX = rnd.nextInt(right) + 1;
        this.exitY = rnd.nextInt(up) + 1;
        this.luck = 20;
        this.newPlayer = new Player();

    }

    //i like to move it move it!
    void Move(char move) {

        switch (move) {
            case ('w'):
            case ('W'):
                yourY++;
                CheckEdge();
                System.out.println("Идем в " + yourY + " " + yourX);
                Lucky(luck);
                break;
            case ('d'):
            case ('D'):
                yourX++;
                CheckEdge();
                System.out.println("Идем в " + yourY + " " + yourX);
                Lucky(luck);
                break;
            case ('s'):
            case ('S'):
                yourY--;
                CheckEdge();
                System.out.println("Идем в " + yourY + " " + yourX);
                Lucky(luck);
                break;
            case ('a'):
            case ('A'):
                yourX--;
                CheckEdge();
                System.out.println("Идем в " + yourY + " " + yourX);
                Lucky(luck);
                break;
            case ('m'):
            case ('M'):
                System.out.println(ANSI_BLUE + "Ваши координаты: " + yourY + " " + yourX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Выход в точке: " + exitY + " " + exitX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Размер уровня:  " + up + " " + right + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Ваши HP: " + newPlayer.getHealthPoint() + ANSI_RESET);
                break;
            default:
                System.out.println(ANSI_RED + "неверный ход" + ANSI_RESET);
                break;
        }
    }


    // possibility to meet the enemy
    private void Lucky(int luck) {
        Random rnd0 = new Random(System.currentTimeMillis());
        int number = rnd0.nextInt(99);
        if (number <= luck) {
            Fight newFight = new Fight();
            newFight.New(newPlayer.getHealthPoint());
//        } else {
//            if (number >= (100 - luck)) {
//                System.out.println(ANSI_YELLOW + "вы нашли шпинат -- HP восстановленны" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "сектор чист" + ANSI_RESET);
        }
    }


    // check for exit LvL

    public boolean ScanExit() {
        if ((yourX == exitX) & (yourY == exitY)) {
            return false;
        } else {
            return true;
        }
    }

    private void CheckEdge() {
        if (((yourY > up) | (yourY < 1)) | ((yourX > right) | (yourX < 1))) {
            if (yourY < 1) yourY = 1;
            if (yourY > up) yourY = up;

            if (yourX < 1) yourX = 1;
            if (yourX > right) yourX = right;
            System.out.println(ANSI_RED + "вы уперлись в стену" + ANSI_RESET);
        }
    }


}