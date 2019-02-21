package com.company.Enemy;

public abstract class Ship {
    static boolean alive;
    static int healthPoint;
    static String name;

    public abstract  void SetPlace();
    public abstract void Damage(char damage);
    public boolean StayingAlive(){
        if (healthPoint<1)
            alive=false;
        return alive;
    }
}

