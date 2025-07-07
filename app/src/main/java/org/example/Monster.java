package org.example;

public class Monster {
    String name;
    int rare;

    Monster(int nameNum, int rareNum) {
        this.name = summonMonster(nameNum);
        this.rare = rareNum;
        if (this.rare >= 3) {
            evolve();
        }
    }

    String summonMonster(int nameNum) {
        String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        return monsters[nameNum];
    }

    void evolve() {
        this.name = "キング" + this.name;
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + "]";
    }
}