package com.company;

import java.util.Scanner;

import static com.company.TextColor.*;

class Level {
    private Player player;
    private int level;

    Level(Player player, int level) {
        this.player = player;
        this.level = level;
    }

    void start() {
        System.out.println("УРОВЕНЬ " + level);

        Board newBoard = new Board(player, level);


        Timer newTimer = new Timer();
        newTimer.set();

        while (!newBoard.getScanExit()) {
            System.out.println(ANSI_RED + newBoard.getYourY() + " " + newBoard.getYourX() + " Ходить на w a s d ;)" + ANSI_RESET);
            char ch=GetChar.Char();
            newBoard.move(ch);
        }
        System.out.println("УРОВЕНЬ ПРОЙДЕН!!!");

    }
}
