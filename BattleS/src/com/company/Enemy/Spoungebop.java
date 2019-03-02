package com.company.Enemy;

import com.company.Delay;

import java.util.Random;

import static com.company.TextColor.ANSI_PURPLE;
import static com.company.TextColor.ANSI_RESET;

public class Spoungebop extends Enemy {

    public Spoungebop() {
        healthPoint = 10;
        name = "Губка Боб-ПИРАТ : ";
        dmg = 4;
        System.out.println("ПОЯВИЛСЯ ПРОТИВНИК");
        new Delay(900);
        say("hello");
    }

    @Override
    void print() {
        int mil = 200;
        System.out.println(ANSI_PURPLE + "      .--..--..--..--..--..--.");
        System.out.println("    .' \\  (`._   (_)     _   \\");
        System.out.println("  .'    |  '._)         (_)  |");
        System.out.println("  \\ _.')\\      .----..---.   /");
        System.out.println("  |(_.'  |    /    .-\\-.  \\  |");
        System.out.println("  \\     0|    |   ( O| O) | o|");
        System.out.println("   |  _  |  .--.____.'._.-.  |");
        System.out.println("   \\ (_) | o         -` .-`  |");
        System.out.println("    |    \\   |`-._ _ _ _ _\\ /");
        System.out.println("    \\    |   |  `. |_||_|   |");
        System.out.println("    | o  |    \\_      \\     |     -.   .-.");
        System.out.println("    |.-.  \\     `--..-'   O |     `.`-' .'");
        System.out.println("  _.'  .' |     `-.-'      /-.__   ' .-'");
        System.out.println(".' `-.` '.|='=.='=.='=.='=|._/_ `-'.'");
        System.out.println("`-._  `.  |________/\\_____|    `-.'");
        System.out.println("   .'   ).| '=' '='\\/ '=' |");
        System.out.println("   `._.`  '---------------'");
        System.out.println("           //___\\   //___\\");
        System.out.println("             ||       ||");
        System.out.println("             ||_.-.   ||_.-.");
        System.out.println("            (_.--__) (_.--__)" + ANSI_RESET);
        new Delay(mil);
    }

    @Override
    public int attac() {
        Random rnd = new Random(System.currentTimeMillis());
        int randomDmg = rnd.nextInt(this.dmg);
        return randomDmg;
    }

    @Override
    protected void say(String say) {
        switch (say) {
            case "again":
                System.out.println(this.name + "Раздавлю твой крабсбургер");
                break;
            case "hurts":
                System.out.println(this.name + "(╯︵╰,)");
                break;
            case "MOM":
                System.out.println("Вы попали в свою маму");
                System.out.println("Стоит пойти и извиниться");
                break;
            case "hello":
                print();
                System.out.println(this.name + "Я из тебя фарш для бургеров сделаю");
                break;
            default:
                System.out.println("╮(￣～￣)╭");
                break;
        }


    }
}