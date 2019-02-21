package com.company.Enemy;


import com.company.Delay;

import static com.company.TextColor.ANSI_PURPLE;
import static com.company.TextColor.ANSI_RESET;

public class MidShip extends SmallShip {

    @Override
    public void SetPlace() {
        alive = true;
        healthPoint = 5;
        name="ШКОЛЬНИК-ПИРАТ : ";
        System.out.println("ПОЯВИЛСЯ ПРОТИВНИК"); new Delay(900);
        Say("hello");
                Print();
    }

@Override
protected void Say(String say){
    switch (say){
        case "again" :
            System.out.println(name+"Ты проиграешь! Как и твоя мамка!" );
            break;
        case "hurts" :
            System.out.println(name+"(╯︵╰,)");
            break;
        case "MOM" :
            System.out.println("Вы попали в свою маму");
            System.out.println("Стоит пойти и извиниться");
            break;
        case "hello":
            System.out.println(name+"PvP или зассал!?");
            break;
        default:
            System.out.println("╮(￣～￣)╭");
            break;
    }

}
@Override
void Print(){
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
public int Attac(){
    return 1;
}

}