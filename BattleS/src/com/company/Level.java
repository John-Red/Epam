package com.company;

import java.util.Scanner;

import static com.company.TextColor.ANSI_RED;
import static com.company.TextColor.ANSI_RESET;

public class Level {
    public void start() {

        for(int i = 1; i<3; i++) {
            // Build map and player inside
            Board newBoard = new Board();
            System.out.println("УРОВЕНЬ " + i);
            Timer newTimer = new Timer();
            newTimer.set();
            // Move
            while (!newBoard.scanExit()) {
                System.out.println(ANSI_RED + newBoard.yourY + " " + newBoard.yourX + " Ходить на w a s d ;)" + ANSI_RESET);
                Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                char ch = sc.next().charAt(0);
                newBoard.move(ch);
            }
            System.out.println("УРОВЕНЬ ПРОЙДЕН!!!");
        }
    }
}
