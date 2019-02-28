package com.company;


import static com.company.TextColor.ANSI_RESET;
import static com.company.TextColor.ANSI_YELLOW;

public class Game {
    public void start() {

        // intro
        Intro newIntro = new Intro();
        newIntro.start();
        newIntro.rules();
        Player player = new Player();
        Level level = new Level(player);
        level.start();

        showVictory();
    }

    private void showVictory() {
        System.out.println(ANSI_YELLOW + "Поздравляю ты выбрался из подземелья!!" + ANSI_RESET);
        System.exit(0);
    }
}

