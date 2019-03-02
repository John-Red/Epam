package com.company;

import java.util.Random;

import static com.company.TextColor.*;

public class Board {
    private Random rnd = new Random(System.currentTimeMillis());
    private int up = rnd.nextInt(15) + 5;
    private int right = rnd.nextInt(15) + 5;
    private int yourX = right / 2 + 1;
    private int yourY = up / 2 + 1;
    private int exitX= rnd.nextInt(right) + 1;
    private int exitY= rnd.nextInt(up) + 1;


    private Player player;
    private int level;
    private Room room;

    Board(Player player, int level){
        this.player=player;
        this.level=level;
        this.room= new Room(player,level);
    }

    //i like to move it move it!
    void move(char move) {


        switch (move) {
            case ('w'):
            case ('W'):
                checkEdgeAndMove(this.yourY,this.yourY++);
                System.out.println("Идем в " + this.yourY + " " + this.yourX);
                break;
            case ('d'):
            case ('D'):
                checkEdgeAndMove(this.yourX,this.yourX++);
                System.out.println("Идем в " + this.yourY + " " + this.yourX);
                break;
            case ('s'):
            case ('S'):
                checkEdgeAndMove(this.yourY,this.yourY--);
                System.out.println("Идем в " + this.yourY + " " + this.yourX);
                break;
            case ('a'):
            case ('A'):
                checkEdgeAndMove(this.yourX,this.yourX--);
                System.out.println("Идем в " + this.yourY + " " + this.yourX);
                break;
            case ('m'):
            case ('M'):
                System.out.println(ANSI_BLUE + "Ваши координаты: " + this.yourY + " " + this.yourX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Выход в точке: " + this.exitY + " " + this.exitX + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Размер уровня:  " + this.up + " " + this.right + ANSI_RESET);
                System.out.println(ANSI_BLUE + "HP :  "+ player.getHealthPoint() + ANSI_RESET);
                break;
            default:
                System.out.println(ANSI_RED + "неверный ход" + ANSI_RESET);
                break;
        }
}


    private boolean scanExit() {
        return (this.yourX == this.exitX) & (this.yourY == this.exitY);
    }

    private void checkEdgeAndMove(int cell, int direction) {
        if (((this.yourY > this.up) | (this.yourY < 1)) | ((this.yourX > this.right) | (this.yourX < 1))) {
            if (this.yourY < 1) this.yourY = 1;
            if (this.yourY > this.up) this.yourY = up;
            if (this.yourX < 1) this.yourX = 1;
            if (this.yourX > this.right) this.yourX = this.right;
            System.out.println(ANSI_RED + "вы уперлись в стену" + ANSI_RESET);
        }else{
            makeStep(cell,direction);
        }
    }
    private void makeStep (int cell, int direction){
        cell=direction;
        room.openNewRoom();
    }

    public boolean getScanExit(){
        return scanExit();
    }
    public int getYourX() {
        return yourX;
    }

    public int getYourY() {
        return yourY;
    }
}