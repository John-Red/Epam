package com.company;


import static com.company.TextColor.ANSI_GREEN;
import static com.company.TextColor.ANSI_RESET;

class Intro {

    void start() {
        System.out.println(ANSI_GREEN + "Друг мой ты попал в передрягу...и тут есть несколько правил" + ANSI_RESET);
        new Delay(300);
    }

    void rules() {
        System.out.println(ANSI_GREEN + "Вводи по О Д Н О М У символу за раз");
        new Delay(300);
        //delay
        System.out.println("Чтобы двигаться есть W A S D");
        new Delay(700);
        //delay
        System.out.println("Найди выход из этих пещер!!! PS: Указан на карте");
        new Delay(300);
        //delay
        System.out.println("Во время битвы АТАКУЙ нажимая W ...СИЛЬНО АТАКОВАТЬ на A");
        new Delay(300);

        System.out.println("Посмотреть КАРТУ M!");
        new Delay(300);
        System.out.println("Сделав шаг рискуешь напороться на монстра. Удачи! И поспеши, говорят воздух может закончится" + ANSI_RESET);
        new Delay(300);
    }
}
