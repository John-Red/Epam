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
    private int luck;
    private Random rnd = new Random(System.currentTimeMillis());
    private Fight newFight;

    Board() {

        this.up = rnd.nextInt(15) + 5;
        this.right = rnd.nextInt(15) + 5;
        this.yourX = right / 2 + 1;
        this.yourY = up / 2 + 1;
        this.exitX = rnd.nextInt(right) + 1;
        this.exitY = rnd.nextInt(up) + 1;
        this.luck = 15;
        this.newFight = new Fight();

    }

    //i like to move it move it!
    void move(char move) {

        switch (move) {
            case ('w'):
            case ('W'):
                checkEdgeAndMove(yourY,yourY++);
                System.out.println("Идем в " + yourY + " " + yourX);
                break;
            case ('d'):
            case ('D'):
                checkEdgeAndMove(yourX,yourX++);
                System.out.println("Идем в " + yourY + " " + yourX);
                break;
            case ('s'):
            case ('S'):
                checkEdgeAndMove(yourY,yourY--);
                System.out.println("Идем в " + yourY + " " + yourX);
                break;
            case ('a'):
            case ('A'):
                checkEdgeAndMove(yourX,yourX--);
                System.out.println("Идем в " + yourY + " " + yourX);
                break;
            case ('m'):
            case ('M'):
                System.out.println(ANSI_BLUE + "Ваши координаты: " + yourY + " " + yourX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Выход в точке: " + exitY + " " + exitX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Размер уровня:  " + up + " " + right + ANSI_RESET);
                System.out.println(ANSI_BLUE + "HP :  " + Player.healthPoint + ANSI_RESET);
                break;
            default:
                System.out.println(ANSI_RED + "неверный ход" + ANSI_RESET);
                break;
        }

}

    // possibility to meet the enemy
    private void checkLuck(int luck) {
        int number = rnd.nextInt(99);
        if (number <= luck) {
            newFight.start();
        } else {
            if (number >= (100 - luck)) {
                Player.healthPoint = 15;
                System.out.println(ANSI_YELLOW + "вы нашли шпинат -- HP восстановленны" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "сектор чист" + ANSI_RESET);
            }
        }
    }

    // check for exit LvL

    public boolean scanExit() {
        return (yourX == exitX) & (yourY == exitY);
    }

    private void checkEdgeAndMove(int cell, int direction) {
        if (((yourY > up) | (yourY < 1)) | ((yourX > right) | (yourX < 1))) {
            if (yourY < 1) yourY = 1;
            if (yourY > up) yourY = up;
            if (yourX < 1) yourX = 1;
            if (yourX > right) yourX = right;
            System.out.println(ANSI_RED + "вы уперлись в стену" + ANSI_RESET);
        }else{
            makeStep(cell,direction);
        }
    }
    private void makeStep (int cell, int direction){
        cell=direction;
        checkLuck(luck);
    }

}