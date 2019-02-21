package com.company;

import java.util.Scanner;

import static com.company.TextColor.ANSI_RED;
import static com.company.TextColor.ANSI_RESET;

public class Level {
    public void New() {
        int countLvls = 1;
        while (countLvls < 3) {
            // Build map and player inside
            Board newBoard = new Board();
            System.out.println("УРОВЕНЬ " + countLvls);
            Timer newTimer = new Timer();
            newTimer.Set();
            // Move
            while (newBoard.ScanExit()) {
                System.out.println(ANSI_RED + newBoard.yourY + " " + newBoard.yourX + " Ходить на w a s d ;)" + ANSI_RESET);
                Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                char ch = sc.next().charAt(0);
                newBoard.Move(ch);
                newBoard.ScanExit();
            }
            countLvls++;
            System.out.println("УРОВЕНЬ ПРОЙДЕН!!!");
        }
    }
}
