package com.company;

public class Main {

    public static void main(String[] args) {

        Hero HER1 = new Hero(200, 7.5, 25);
        Hero HER2 = new Hero(210, 7.25, 20);
        Hero HER3 = new Hero(220, 7.0, 15);
        Hero HER4 = new Hero(230, 6.75, 10);

        Boss BOSS = new Boss();
        BOSS.setBossHealth(1000);
        BOSS.setBossDamage(30);
        BOSS.setBossDefense(25);

    }
}
