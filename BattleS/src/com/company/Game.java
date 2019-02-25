package com.company;


import static com.company.TextColor.ANSI_RESET;
import static com.company.TextColor.ANSI_YELLOW;

public class Game {
    public void start() {

        // intro
        Intro newIntro = new Intro();
        newIntro.start();
        newIntro.rules();
        Level newLevel = new Level();
        newLevel.start();

        thisVictory();
    }

    private void thisVictory() {
        System.out.println(ANSI_YELLOW + "Поздравляю ты выбрался из подземелья!!" + ANSI_RESET);
        System.exit(0);
    }
}

