package org.example;

public class Monster {
    String name;
    int rare;

    public Monster(int number, int rare) {
        this.name = summonMonster(number);
        this.rare = rare;
        if (rare >= 3) {
            evolve();
        }
    }

    String summonMonster(int number) {
        String[] monsters = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        return monsters[number];
    }

    void evolve() {
        this.name = "キング" + this.name;
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + "]";
    }
}
