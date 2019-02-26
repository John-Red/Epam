package com.company.Enemy;

import com.company.Delay;

import static com.company.TextColor.*;

public class Catto extends Enemy {


   public Catto() {
        healthPoint = 1;
        name="Кошка-ПИРАТ : ";
        dmg=1;
        System.out.println("ПОЯВИЛСЯ ПРОТИВНИК"); new Delay(900);
       say("hello");
       print();
    }

       @Override
    protected void say(String say){
        switch (say){
            case "again" :
                System.out.println(this.name+"Ты проиграешь! Тебе ни за что не победить меня" );
                break;
            case "hurts" :
                System.out.println(this.name+".･ﾟﾟ･(／ω＼)･ﾟﾟ･");
                break;
            case "MOM" :
                System.out.println("Вы попали в свою маму");
                System.out.println("Стоит пойти и извиниться");
                break;
            case "hello":
                System.out.println(this.name+"Тобi Пiзда");
                break;
                default:
                    System.out.println("╮(￣～￣)╭");
                    break;
        }

    }
    @Override
    void print(){
        int mil = 200;
        System.out.println(ANSI_PURPLE+"／ﾌﾌ 　　　　　 　　 　ム｀ヽ");
        System.out.println("/ ノ)　　 ∧　　∧　　　　）　ヽ");
        System.out.println("/ ｜　　(´・ω ・`）ノ⌒（ゝ._,ノ");
        System.out.println("/　ﾉ⌒＿⌒ゝーく　 ＼　　／");
        System.out.println("丶＿ ノ 　　 ノ､　　|　/");
        System.out.println("　　 `ヽ `ー-‘人`ーﾉ /");
        System.out.println("　　　 丶 ￣ _人’彡ﾉ");
        System.out.println("　　　／｀ヽ _/\\__' "+ ANSI_RESET);new Delay(mil);
    }

}