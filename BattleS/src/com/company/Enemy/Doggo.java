package com.company.Enemy;


import com.company.Delay;

import static com.company.TextColor.ANSI_PURPLE;
import static com.company.TextColor.ANSI_RESET;

public class Doggo extends Enemy {

    public Doggo() {
        healthPoint = 5;
        name="Собака-ПИРАТ : ";
        dmg=2;
        System.out.println("ПОЯВИЛСЯ ПРОТИВНИК"); new Delay(900);
        say("hello");
    }

@Override
protected void say(String say){
    switch (say){
        case "again" :
            System.out.println(this.name+"Ты проиграешь! Как и твоя мамка!" );
            break;
        case "hurts" :
            System.out.println(this.name+"(╯︵╰,)");
            break;
        case "MOM" :
            System.out.println("Вы попали в свою маму");
            System.out.println("Стоит пойти и извиниться");
            break;
        case "hello":
            print();
            System.out.println(this.name+"PvP или зассал!?");
            break;
        default:
            System.out.println("╮(￣～￣)╭");
            break;
    }

}
@Override
void print(){
    int mil = 200;
    System.out.println(ANSI_PURPLE+"░░░░░░░█▐▓▓░████▄▄▄█▀▄▓▓▓▌█ ");
    System.out.println("░░░░░▄█▌▀▄▓▓▄▄▄▄▀▀▀▄▓▓▓▓▓▌█ ");
    System.out.println("░░░▄█▀▀▄▓█▓▓▓▓▓▓▓▓▓▓▓▓▀░▓▌█ ");
    System.out.println("░░█▀▄▓▓▓███▓▓▓███▓▓▓▄░░▄▓▐█▌ ");
    System.out.println("░█▌▓▓▓▀▀▓▓▓▓███▓▓▓▓▓▓▓▄▀▓▓▐█ ");
    System.out.println("▐█▐██▐░▄▓▓▓▓▓▀▄░▀▓▓▓▓▓▓▓▓▓▌█▌");
    System.out.println("█▌███▓▓▓▓▓▓▓▓▐░░▄▓▓███▓▓▓▄▀▐█ ");
    System.out.println("█▐█▓▀░░▀▓▓▓▓▓▓▓▓▓██████▓▓▓▓▐█ ");
    System.out.println("▌▓▄▌▀░▀░▐▀█▄▓▓██████████▓▓▓▌█▌ ");
    System.out.println("▌▓▓▓▄▄▀▀▓▓▓▀▓▓▓▓▓▓▓▓█▓█▓█▓▓▌█▌ ");
    System.out.println("█▐▓▓▓▓▓▓▄▄▄▓▓▓▓▓▓█▓█▓█▓█▓▓▓▐█");
    System.out.println("█▐▓▓▓▓▓▓▄▄▄▓▓▓▓▓▓█▓█▓█▓█▓▓▓▐█"+ ANSI_RESET);new Delay(mil);
}
}