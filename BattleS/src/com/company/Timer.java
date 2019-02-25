package com.company;


public class Timer {
    public void set() {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(120000);
                        System.out.println("Воздух закончился");
                        new GameOver();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}