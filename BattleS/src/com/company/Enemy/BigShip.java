package com.company.Enemy;

import com.company.Delay;

import java.util.Random;

import static com.company.TextColor.ANSI_PURPLE;
import static com.company.TextColor.ANSI_RESET;

public class BigShip extends MidShip {
    @Override
    public void SetPlace() {
        alive = true;
        healthPoint = 10;
        name = "СТУДЕНТ-ПИРАТ : ";
        System.out.println("ПОЯВИЛСЯ ПРОТИВНИК"); new Delay(900);
        Say("hello");
        Print();
    }
    @Override
    void Print(){
        int mil=200;
        System.out.println(ANSI_PURPLE+"      .--..--..--..--..--..--.");
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
        System.out.println("            (_.--__) (_.--__)"+ ANSI_RESET);new Delay(mil);
    }

    @Override
    public int Attac(){
        Random rnd = new Random(System.currentTimeMillis());
        int random =rnd.nextInt(4);
        return random;
    }
}
