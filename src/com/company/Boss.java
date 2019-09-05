package com.company;

public class Boss {
    private int bossHealth;
    private double bossDamage;
    private int bossDefense;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public double getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(double bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(int bossDefense) {
        this.bossDefense = bossDefense;
    }

    public double changeBossDefense(float coefficient) {
        return bossDefense * coefficient;
    }
}
