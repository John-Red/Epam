package com.company;


import static com.company.TextColor.ANSI_RESET;
import static com.company.TextColor.ANSI_YELLOW;

public class Game {
    public void Start() {

        // intro
        Intro newIntro = new Intro();
        newIntro.Start();
        newIntro.Rules();
        Level newLevel = new Level();
        newLevel.New();

        Victory();
    }

    private void Victory() {
        System.out.println(ANSI_YELLOW + "Поздравляю ты выбрался из подземелья!!" + ANSI_RESET);
        System.exit(0);
    }
}

